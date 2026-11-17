package krqnebusok;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements gxszxtbevo, fyldjkxazc.gxszxtbevo, lg.btonecajqb.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final androidx.compose.runtime.oxmwwwfdhm f60490zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f60489yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final int f60488jyumaefscl = 8;

    public static final class iobyxmoadg implements lg.btonecajqb.ppxfxbqfkf {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(androidx.compose.runtime.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f60490zdlpuopuiu = oxmwwwfdhmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List gxszxtbevo(nufgyqmvbu nufgyqmvbuVar, Object obj) {
        return nufgyqmvbuVar.f60490zdlpuopuiu.B(obj);
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return lg.btonecajqb.zoijcleaow.iobyxmoadg.iobyxmoadg(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return lg.btonecajqb.zoijcleaow.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb.zoijcleaow
    public lg.btonecajqb.ppxfxbqfkf getKey() {
        return f60489yggfygwlhe;
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return lg.btonecajqb.zoijcleaow.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb plus(lg.btonecajqb btonecajqbVar) {
        return lg.btonecajqb.zoijcleaow.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }

    @Override // fyldjkxazc.gxszxtbevo
    public List ppxfxbqfkf(Integer num) {
        return this.f60490zdlpuopuiu.h();
    }

    @Override // krqnebusok.gxszxtbevo
    public boolean zoijcleaow(Throwable th2, final Object obj) {
        return wkgbmnqykc.ppxfxbqfkf(th2, new tg.iobyxmoadg() { // from class: krqnebusok.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.gxszxtbevo(this.f60487zdlpuopuiu, obj);
            }
        });
    }
}
