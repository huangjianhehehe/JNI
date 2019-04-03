
#include <jni.h>
#include <malloc.h>
#include <string.h>

/*
 * 把一个Jstring转换成一个c语言的char *类型
 * */
char * _JString2CStr(JNIEnv* env,jstring jstr){
    char* rtn=NULL;
    jclass clsstring=(*env)->FindClass(env,"java/lang/String");
    jstring strencode =(*env)->NewStringUTF(env,"GB2312");
    jmethodID mid=(*env)->GetMethodID(env,clsstring,"getBytes","(Ljava/lang/String;)[B");
    jbyteArray barr=(jbyteArray)(*env)->CallObjectMethod(env,jstr,mid,strencode);
    jsize alen=(*env)->GetArrayLength(env,barr);
    jbyte* ba =(*env)->GetByteArrayElements(env,barr,JNI_FALSE);
    if(alen>0){
        rtn=(char*)malloc(alen+1); //"\0"
        memcpy(rtn,ba,alen);
        rtn[alen]=0;
    }
    (*env)->ReleaseByteArrayElements(env,barr,ba,0);
    return rtn;
}
JNIEXPORT jint JNICALL Java_appstore_xianchuang_com_javatoc_JNI_add
  (JNIEnv * env, jobject thiz, jint x, jint y){
    return x+y;
  };

/*
 * Class:     appstore_xianchuang_com_javatoc_JNI
 * Method:    sayHelloInC
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_appstore_xianchuang_com_javatoc_JNI_sayHelloInC
  (JNIEnv * env, jobject thiz, jstring jstr){
        //把java字符串转换成c字符串
        char* cstr=_JString2CStr(env,jstr);
        //获取c字符串长度
        int length=strlen(cstr);
        int i;
    for (i = 0; i <length ; i++) {
        *(cstr+i)+=1;
    }
    return (*env)->NewStringUTF(env,cstr);
};

//传递int类型的数组
JNIEXPORT jintArray JNICALL Java_appstore_xianchuang_com_javatoc_JNI_arrElementsIncrease
  (JNIEnv * env, jobject thiz, jintArray jarr){
    //获取数组的长度
    int length =(*env)->GetArrayLength(env,jarr);
    //获取数组首地址
    jboolean isCopy=NULL;  //判断执行完GetIntArrayElements之后是否创建了新
                        //数组,如果创建了副本就返回true,没有创建就返回false
    int *p=(*env)->GetIntArrayElements(env,jarr,NULL);
    int i;
    for(i=0;i<length;i++){
        *(p+i)+=10;
    }
    /*由于获取到了数组的首地址,所以通过指针操作了每一个元素之后jarr里的
     * 每一个元素都被修改了,所以没有必要创建新的数组,直接返回jarr*/
    return jarr;
};

