package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class crxdokpmqz {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f4964eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f4965gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private fyldjkxazc f4966iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f4967lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hszhottldk f4968ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private wizcaqwiak f4969wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private tg.draadjrbmk f4970zoijcleaow;

    private final class iobyxmoadg implements dvvnrvtcbc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f4971iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f4973zoijcleaow = new ArrayList();

        public iobyxmoadg(int i13) {
            this.f4971iobyxmoadg = i13;
        }

        @Override // androidx.compose.foundation.lazy.layout.dvvnrvtcbc
        public void iobyxmoadg(int i13) {
            wizcaqwiak wizcaqwiakVarEablkybsjg = crxdokpmqz.this.eablkybsjg();
            if (wizcaqwiakVarEablkybsjg == null) {
                return;
            }
            this.f4973zoijcleaow.add(wizcaqwiakVarEablkybsjg.wkgbmnqykc(i13, crxdokpmqz.this.f4968ppxfxbqfkf));
        }

        public final List ppxfxbqfkf() {
            return this.f4973zoijcleaow;
        }

        @Override // androidx.compose.foundation.lazy.layout.dvvnrvtcbc
        public int zoijcleaow() {
            return this.f4971iobyxmoadg;
        }
    }

    public interface ppxfxbqfkf {
        long ppxfxbqfkf(int i13);

        int zoijcleaow();
    }

    public interface zoijcleaow {
        void cancel();

        void iobyxmoadg();
    }

    public crxdokpmqz() {
        this.f4968ppxfxbqfkf = new hszhottldk();
        this.f4964eablkybsjg = -1;
        this.f4965gxszxtbevo = -1;
    }

    public static /* synthetic */ zoijcleaow nufgyqmvbu(crxdokpmqz crxdokpmqzVar, int i13, long j13, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            draadjrbmkVar = null;
        }
        return crxdokpmqzVar.lqeggnwhkg(i13, j13, draadjrbmkVar);
    }

    public final void btonecajqb(int i13) {
        this.f4965gxszxtbevo = i13;
    }

    public final void draadjrbmk(int i13) {
        this.f4964eablkybsjg = i13;
    }

    public final zoijcleaow dxjokdxxww(int i13, long j13, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        zoijcleaow zoijcleaowVarNufgyqmvbu;
        wizcaqwiak wizcaqwiakVar = this.f4969wkgbmnqykc;
        return (wizcaqwiakVar == null || (zoijcleaowVarNufgyqmvbu = wizcaqwiakVar.nufgyqmvbu(i13, j13, this.f4968ppxfxbqfkf, z13, draadjrbmkVar)) == null) ? eablkybsjg.f4979iobyxmoadg : zoijcleaowVarNufgyqmvbu;
    }

    public final wizcaqwiak eablkybsjg() {
        return this.f4969wkgbmnqykc;
    }

    public final void gtknphoqwx(wizcaqwiak wizcaqwiakVar) {
        this.f4969wkgbmnqykc = wizcaqwiakVar;
    }

    public final fyldjkxazc gxszxtbevo() {
        return this.f4966iobyxmoadg;
    }

    public final zoijcleaow lqeggnwhkg(int i13, long j13, tg.draadjrbmk draadjrbmkVar) {
        return dxjokdxxww(i13, j13, true, draadjrbmkVar);
    }

    public final int ppxfxbqfkf() {
        return this.f4965gxszxtbevo;
    }

    public final int wkgbmnqykc() {
        return this.f4967lqeggnwhkg;
    }

    public final List zoijcleaow() {
        tg.draadjrbmk draadjrbmkVar = this.f4970zoijcleaow;
        if (draadjrbmkVar == null) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f4964eablkybsjg);
        draadjrbmkVar.invoke(iobyxmoadgVar);
        List listPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        this.f4967lqeggnwhkg = listPpxfxbqfkf.size();
        return listPpxfxbqfkf;
    }

    public crxdokpmqz(fyldjkxazc fyldjkxazcVar, tg.draadjrbmk draadjrbmkVar) {
        this();
        this.f4966iobyxmoadg = fyldjkxazcVar;
        this.f4970zoijcleaow = draadjrbmkVar;
    }
}
