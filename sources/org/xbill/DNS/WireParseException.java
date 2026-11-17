package org.xbill.DNS;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class WireParseException extends IOException {
    public WireParseException() {
    }

    public WireParseException(String str) {
        super(str);
    }

    public WireParseException(String str, Throwable th2) {
        super(str);
        initCause(th2);
    }
}
