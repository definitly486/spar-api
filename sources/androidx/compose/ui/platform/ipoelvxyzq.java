package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
final class ipoelvxyzq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f6983eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final e f6984iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f6985ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private ipoelvxyzq.ppxfxbqfkf f6986wkgbmnqykc = new ipoelvxyzq.ppxfxbqfkf(new z.grlcpdaxtj[16], 0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f6987zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((p0.pmvmpeiblj) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(p0.pmvmpeiblj pmvmpeibljVar) {
            pmvmpeibljVar.iobyxmoadg();
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = ipoelvxyzq.this.f6986wkgbmnqykc;
            Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
            int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            int i13 = 0;
            while (true) {
                if (i13 >= iDraadjrbmk) {
                    i13 = -1;
                    break;
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((z.grlcpdaxtj) objArr[i13], pmvmpeibljVar)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 >= 0) {
                ipoelvxyzq.this.f6986wkgbmnqykc.oxmwwwfdhm(i13);
            }
            if (ipoelvxyzq.this.f6986wkgbmnqykc.draadjrbmk() == 0) {
                ipoelvxyzq.this.f6987zoijcleaow.invoke();
            }
        }
    }

    public ipoelvxyzq(e eVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f6984iobyxmoadg = eVar;
        this.f6987zoijcleaow = iobyxmoadgVar;
    }

    public final boolean eablkybsjg() {
        return !this.f6983eablkybsjg;
    }

    public final InputConnection ppxfxbqfkf(EditorInfo editorInfo) {
        synchronized (this.f6985ppxfxbqfkf) {
            if (this.f6983eablkybsjg) {
                return null;
            }
            p0.pmvmpeiblj pmvmpeibljVarIobyxmoadg = p0.wwaezpbzkn.iobyxmoadg(this.f6984iobyxmoadg.iobyxmoadg(editorInfo), new iobyxmoadg());
            this.f6986wkgbmnqykc.zoijcleaow(new z.grlcpdaxtj(pmvmpeibljVarIobyxmoadg));
            return pmvmpeibljVarIobyxmoadg;
        }
    }

    public final void wkgbmnqykc() {
        synchronized (this.f6985ppxfxbqfkf) {
            try {
                this.f6983eablkybsjg = true;
                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f6986wkgbmnqykc;
                Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
                int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
                    p0.pmvmpeiblj pmvmpeibljVar = (p0.pmvmpeiblj) ((z.grlcpdaxtj) objArr[i13]).get();
                    if (pmvmpeibljVar != null) {
                        pmvmpeibljVar.iobyxmoadg();
                    }
                }
                this.f6986wkgbmnqykc.nufgyqmvbu();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
