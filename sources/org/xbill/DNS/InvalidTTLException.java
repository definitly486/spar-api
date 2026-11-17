package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidTTLException extends IllegalArgumentException {
    public InvalidTTLException(long j13) {
        super("Invalid DNS TTL: " + j13);
    }
}
