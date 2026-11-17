package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class RelativeNameException extends IllegalArgumentException {
    public RelativeNameException(auzgnhcxok auzgnhcxokVar) {
        super("'" + auzgnhcxokVar + "' is not an absolute name");
    }

    public RelativeNameException(String str) {
        super(str);
    }
}
