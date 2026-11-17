package xf;

import android.content.Context;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ribwqtqdhb;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements zf.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f122282iwizpuwonk = new Object();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile sf.zoijcleaow f122283jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Context f122284yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ribwqtqdhb f122285zdlpuopuiu;

    static abstract class eablkybsjg {
        static rf.iobyxmoadg iobyxmoadg() {
            return new wf.eablkybsjg();
        }
    }

    class iobyxmoadg implements crxdokpmqz.ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Context f122287zoijcleaow;

        iobyxmoadg(Context context) {
            this.f122287zoijcleaow = context;
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class cls, t2.iobyxmoadg iobyxmoadgVar) {
            lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(iobyxmoadgVar);
            return new ppxfxbqfkf(((InterfaceC3078zoijcleaow) rf.ppxfxbqfkf.iobyxmoadg(this.f122287zoijcleaow, InterfaceC3078zoijcleaow.class)).nufgyqmvbu().iobyxmoadg(lqeggnwhkgVar).build(), lqeggnwhkgVar);
        }
    }

    static final class ppxfxbqfkf extends ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sf.zoijcleaow f122288iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lqeggnwhkg f122289zoijcleaow;

        ppxfxbqfkf(sf.zoijcleaow zoijcleaowVar, lqeggnwhkg lqeggnwhkgVar) {
            this.f122288iobyxmoadg = zoijcleaowVar;
            this.f122289zoijcleaow = lqeggnwhkgVar;
        }

        lqeggnwhkg draadjrbmk() {
            return this.f122289zoijcleaow;
        }

        sf.zoijcleaow gtknphoqwx() {
            return this.f122288iobyxmoadg;
        }

        @Override // androidx.lifecycle.ntlheqmsrt
        protected void onCleared() {
            super.onCleared();
            ((wf.eablkybsjg) ((wkgbmnqykc) qf.iobyxmoadg.iobyxmoadg(this.f122288iobyxmoadg, wkgbmnqykc.class)).zoijcleaow()).iobyxmoadg();
        }
    }

    public interface wkgbmnqykc {
        rf.iobyxmoadg zoijcleaow();
    }

    /* JADX INFO: renamed from: xf.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public interface InterfaceC3078zoijcleaow {
        vf.zoijcleaow nufgyqmvbu();
    }

    zoijcleaow(androidx.activity.nufgyqmvbu nufgyqmvbuVar) {
        this.f122285zdlpuopuiu = nufgyqmvbuVar;
        this.f122284yggfygwlhe = nufgyqmvbuVar;
    }

    private sf.zoijcleaow iobyxmoadg() {
        return ((ppxfxbqfkf) wkgbmnqykc(this.f122285zdlpuopuiu, this.f122284yggfygwlhe).zoijcleaow(ppxfxbqfkf.class)).gtknphoqwx();
    }

    private crxdokpmqz wkgbmnqykc(ribwqtqdhb ribwqtqdhbVar, Context context) {
        return new crxdokpmqz(ribwqtqdhbVar, new iobyxmoadg(context));
    }

    public lqeggnwhkg ppxfxbqfkf() {
        return ((ppxfxbqfkf) wkgbmnqykc(this.f122285zdlpuopuiu, this.f122284yggfygwlhe).zoijcleaow(ppxfxbqfkf.class)).draadjrbmk();
    }

    @Override // zf.zoijcleaow
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public sf.zoijcleaow ojitshcjhn() {
        if (this.f122283jyumaefscl == null) {
            synchronized (this.f122282iwizpuwonk) {
                try {
                    if (this.f122283jyumaefscl == null) {
                        this.f122283jyumaefscl = iobyxmoadg();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f122283jyumaefscl;
    }
}
