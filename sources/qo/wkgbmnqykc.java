package qo;

import ru.myspar.app.MySparApp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc extends ru.myspar.app.iobyxmoadg implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f79254zdlpuopuiu = false;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final xf.wkgbmnqykc f79253yggfygwlhe = new xf.wkgbmnqykc(new iobyxmoadg());

    class iobyxmoadg implements xf.eablkybsjg {
        iobyxmoadg() {
        }

        @Override // xf.eablkybsjg
        public Object get() {
            return zoijcleaow.iobyxmoadg().iobyxmoadg(new yf.iobyxmoadg(wkgbmnqykc.this)).zoijcleaow();
        }
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // ru.myspar.app.iobyxmoadg, android.app.Application
    public void onCreate() {
        ppxfxbqfkf();
        super.onCreate();
    }

    protected void ppxfxbqfkf() {
        if (this.f79254zdlpuopuiu) {
            return;
        }
        this.f79254zdlpuopuiu = true;
        ((btonecajqb) ojitshcjhn()).zoijcleaow((MySparApp) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public final xf.wkgbmnqykc oxmwwwfdhm() {
        return this.f79253yggfygwlhe;
    }
}
