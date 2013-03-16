LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := linuxmagazine
LOCAL_SRC_FILES := linuxmagazine.c

include $(BUILD_SHARED_LIBRARY)