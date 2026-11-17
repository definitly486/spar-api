package com.google.crypto.tink.internal;

import bb.esjtqupxsv;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dxjokdxxww f23829zoijcleaow = new dxjokdxxww();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f23830iobyxmoadg = new AtomicReference(new oxmwwwfdhm.zoijcleaow().eablkybsjg());

    public static dxjokdxxww iobyxmoadg() {
        return f23829zoijcleaow;
    }

    public synchronized void eablkybsjg(zoijcleaow zoijcleaowVar) {
        this.f23830iobyxmoadg.set(new oxmwwwfdhm.zoijcleaow((oxmwwwfdhm) this.f23830iobyxmoadg.get()).gxszxtbevo(zoijcleaowVar).eablkybsjg());
    }

    public synchronized void gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f23830iobyxmoadg.set(new oxmwwwfdhm.zoijcleaow((oxmwwwfdhm) this.f23830iobyxmoadg.get()).lqeggnwhkg(ppxfxbqfkfVar).eablkybsjg());
    }

    public synchronized void lqeggnwhkg(btonecajqb btonecajqbVar) {
        this.f23830iobyxmoadg.set(new oxmwwwfdhm.zoijcleaow((oxmwwwfdhm) this.f23830iobyxmoadg.get()).nufgyqmvbu(btonecajqbVar).eablkybsjg());
    }

    public synchronized void nufgyqmvbu(gtknphoqwx gtknphoqwxVar) {
        this.f23830iobyxmoadg.set(new oxmwwwfdhm.zoijcleaow((oxmwwwfdhm) this.f23830iobyxmoadg.get()).dxjokdxxww(gtknphoqwxVar).eablkybsjg());
    }

    public bb.lqeggnwhkg ppxfxbqfkf(vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar) {
        return ((oxmwwwfdhm) this.f23830iobyxmoadg.get()).gxszxtbevo(vdvldrhtssVar, esjtqupxsvVar);
    }

    public bb.lqeggnwhkg wkgbmnqykc(ojitshcjhn ojitshcjhnVar, esjtqupxsv esjtqupxsvVar) {
        if (esjtqupxsvVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (zoijcleaow(ojitshcjhnVar)) {
            return ppxfxbqfkf(ojitshcjhnVar, esjtqupxsvVar);
        }
        try {
            return new eablkybsjg(ojitshcjhnVar, esjtqupxsvVar);
        } catch (GeneralSecurityException e13) {
            throw new TinkBugException("Creating a LegacyProtoKey failed", e13);
        }
    }

    public boolean zoijcleaow(vdvldrhtss vdvldrhtssVar) {
        return ((oxmwwwfdhm) this.f23830iobyxmoadg.get()).eablkybsjg(vdvldrhtssVar);
    }
}
