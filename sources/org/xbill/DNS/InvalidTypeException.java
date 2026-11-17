package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidTypeException extends IllegalArgumentException {
    public InvalidTypeException(int i13) {
        super("Invalid DNS type: " + i13);
    }
}
