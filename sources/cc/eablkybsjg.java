package cc;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final zoijcleaow f19569ppxfxbqfkf = new zoijcleaow();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gc.lqeggnwhkg f19570iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ppxfxbqfkf f19571zoijcleaow;

    private static final class zoijcleaow implements ppxfxbqfkf {
        private zoijcleaow() {
        }

        @Override // cc.ppxfxbqfkf
        public void iobyxmoadg() {
        }

        @Override // cc.ppxfxbqfkf
        public byte[] ppxfxbqfkf() {
            return null;
        }

        @Override // cc.ppxfxbqfkf
        public void wkgbmnqykc() {
        }

        @Override // cc.ppxfxbqfkf
        public String zoijcleaow() {
            return null;
        }
    }

    public eablkybsjg(gc.lqeggnwhkg lqeggnwhkgVar) {
        this.f19570iobyxmoadg = lqeggnwhkgVar;
        this.f19571zoijcleaow = f19569ppxfxbqfkf;
    }

    private File wkgbmnqykc(String str) {
        return this.f19570iobyxmoadg.vdvldrhtss(str, "userlog");
    }

    public final void eablkybsjg(String str) {
        this.f19571zoijcleaow.iobyxmoadg();
        this.f19571zoijcleaow = f19569ppxfxbqfkf;
        if (str == null) {
            return;
        }
        gxszxtbevo(wkgbmnqykc(str), 65536);
    }

    void gxszxtbevo(File file, int i13) {
        this.f19571zoijcleaow = new nufgyqmvbu(file, i13);
    }

    public void iobyxmoadg() {
        this.f19571zoijcleaow.wkgbmnqykc();
    }

    public String ppxfxbqfkf() {
        return this.f19571zoijcleaow.zoijcleaow();
    }

    public byte[] zoijcleaow() {
        return this.f19571zoijcleaow.ppxfxbqfkf();
    }

    public eablkybsjg(gc.lqeggnwhkg lqeggnwhkgVar, String str) {
        this(lqeggnwhkgVar);
        eablkybsjg(str);
    }
}
