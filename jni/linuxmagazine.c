
#include <com_msi_linuxmagazine_jnisample_LMJNI.h>


JNIEXPORT jstring JNICALL Java_com_msi_linuxmagazine_jnisample_LMJNI_stringFromJNI( JNIEnv* env,jobject thiz )
{
    return (*env)->NewStringUTF(env, "Hello from Linux Magazine!");
}

JNIEXPORT jint JNICALL Java_com_msi_linuxmagazine_jnisample_LMJNI_incrementFromJNI(JNIEnv* env,jobject thiz,jint innumber)
{
	return innumber + 1;
}
