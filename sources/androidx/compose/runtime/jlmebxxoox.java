package androidx.compose.runtime;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class jlmebxxoox {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ulzqkzuiru f5699iobyxmoadg = new ulzqkzuiru();

    public static final pj.cllcsxoeiz dxjokdxxww(lg.btonecajqb btonecajqbVar, draadjrbmk draadjrbmkVar) {
        if (btonecajqbVar.get(pj.auzgnhcxok.f76671gtknphoqwx) == null) {
            return new w(draadjrbmkVar.oxmwwwfdhm(), btonecajqbVar);
        }
        pj.pmvmpeiblj pmvmpeibljVarZoijcleaow = pj.skhdrjzrfn.zoijcleaow(null, 1, null);
        pmvmpeibljVarZoijcleaow.wkgbmnqykc(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return pj.dsvhmnatus.iobyxmoadg(pmvmpeibljVarZoijcleaow);
    }

    public static final void eablkybsjg(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1179185413, i13, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        lg.btonecajqb btonecajqbVarOxmwwwfdhm = draadjrbmkVar.oxmwwwfdhm();
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(obj);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new sflfametgt(btonecajqbVarOxmwwwfdhm, rgvfuqvkyqVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
    }

    public static final void gxszxtbevo(Object[] objArr, tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-139560008, i13, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:407)");
        }
        lg.btonecajqb btonecajqbVarOxmwwwfdhm = draadjrbmkVar.oxmwwwfdhm();
        boolean zUlzqkzuiru = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zUlzqkzuiru |= draadjrbmkVar.ulzqkzuiru(obj);
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            draadjrbmkVar.jyumaefscl(new sflfametgt(btonecajqbVarOxmwwwfdhm, rgvfuqvkyqVar));
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
    }

    public static final void iobyxmoadg(Object obj, Object obj2, tg.draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1429097729, i13, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean zUlzqkzuiru = draadjrbmkVar2.ulzqkzuiru(obj) | draadjrbmkVar2.ulzqkzuiru(obj2);
        Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new mbcevpiqjq(draadjrbmkVar);
            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
    }

    public static final void lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1288466761, i13, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        draadjrbmkVar.nufgyqmvbu(iobyxmoadgVar);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
    }

    public static final void ppxfxbqfkf(Object[] objArr, tg.draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1307627122, i13, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean zUlzqkzuiru = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zUlzqkzuiru |= draadjrbmkVar2.ulzqkzuiru(obj);
        }
        Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            draadjrbmkVar2.jyumaefscl(new mbcevpiqjq(draadjrbmkVar));
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
    }

    public static final void wkgbmnqykc(Object obj, Object obj2, tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(590241125, i13, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        lg.btonecajqb btonecajqbVarOxmwwwfdhm = draadjrbmkVar.oxmwwwfdhm();
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(obj) | draadjrbmkVar.ulzqkzuiru(obj2);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new sflfametgt(btonecajqbVarOxmwwwfdhm, rgvfuqvkyqVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
    }

    public static final void zoijcleaow(Object obj, tg.draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1371986847, i13, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zUlzqkzuiru = draadjrbmkVar2.ulzqkzuiru(obj);
        Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new mbcevpiqjq(draadjrbmkVar);
            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
    }
}
