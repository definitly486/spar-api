package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
abstract class eablkybsjg implements am.iobyxmoadg, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    eablkybsjg() {
    }

    @Override // am.iobyxmoadg
    public abstract String getName();

    protected Object readResolve() throws ObjectStreamException {
        return am.zoijcleaow.btonecajqb(getName());
    }
}
