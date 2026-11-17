package com.yandex.runtime.internal;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class AvailableSpace {
    AvailableSpace() {
    }

    public static long getAvailableSpaceOnFilesystem(String str) throws Exception {
        return new File(str).getUsableSpace();
    }
}
