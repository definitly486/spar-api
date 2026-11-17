package dm;

import cm.kcexrzcfyt;
import cm.rgvfuqvkyq;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends eablkybsjg implements Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gxszxtbevo f29133cqumvgiudr = new gxszxtbevo();
    private static final long serialVersionUID = -1440403870442975015L;

    private gxszxtbevo() {
    }

    private Object readResolve() {
        return f29133cqumvgiudr;
    }

    @Override // dm.eablkybsjg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt dxjokdxxww(cm.wkgbmnqykc wkgbmnqykcVar, rgvfuqvkyq rgvfuqvkyqVar) {
        return kcexrzcfyt.hcddaimhww(wkgbmnqykcVar, rgvfuqvkyqVar);
    }

    @Override // dm.eablkybsjg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public cm.eablkybsjg wkgbmnqykc(gm.eablkybsjg eablkybsjgVar) {
        return cm.eablkybsjg.zynmafqrjb(eablkybsjgVar);
    }

    public boolean draadjrbmk(long j13) {
        return (3 & j13) == 0 && (j13 % 100 != 0 || j13 % 400 == 0);
    }

    @Override // dm.eablkybsjg
    public String nufgyqmvbu() {
        return "ISO";
    }
}
