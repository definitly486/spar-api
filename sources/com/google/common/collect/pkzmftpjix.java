package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pkzmftpjix implements Comparator {
    protected pkzmftpjix() {
    }

    public static pkzmftpjix lqeggnwhkg() {
        return lmojexxdyd.f23683zdlpuopuiu;
    }

    public static pkzmftpjix wkgbmnqykc(Comparator comparator) {
        return comparator instanceof pkzmftpjix ? (pkzmftpjix) comparator : new draadjrbmk(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public pkzmftpjix dxjokdxxww() {
        return new wypolnanlu(this);
    }

    public pkzmftpjix iobyxmoadg(Comparator comparator) {
        return new agtfadlqog(this, (Comparator) xa.draadjrbmk.btonecajqb(comparator));
    }

    public pkzmftpjix nufgyqmvbu(xa.eablkybsjg eablkybsjgVar) {
        return new lqeggnwhkg(eablkybsjgVar, this);
    }
}
