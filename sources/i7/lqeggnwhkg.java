package i7;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.hkdspvbjdz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f42068iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f42069jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f42070yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f42071zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42069jyumaefscl = obj;
            this.f42068iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow implements androidx.lifecycle.gxszxtbevo {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f42072zdlpuopuiu;

        zoijcleaow(pj.agtfadlqog agtfadlqogVar) {
            this.f42072zdlpuopuiu = agtfadlqogVar;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onStart(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
            pj.agtfadlqog agtfadlqogVar = this.f42072zdlpuopuiu;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object iobyxmoadg(androidx.lifecycle.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        androidx.lifecycle.gtknphoqwx gtknphoqwxVar2;
        hkdspvbjdz hkdspvbjdzVar;
        Throwable th2;
        androidx.lifecycle.rgvfuqvkyq rgvfuqvkyqVar;
        androidx.lifecycle.rgvfuqvkyq rgvfuqvkyqVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f42068iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f42068iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f42069jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f42068iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hkdspvbjdzVar = (hkdspvbjdz) iobyxmoadgVar.f42070yggfygwlhe;
            gtknphoqwxVar2 = (androidx.lifecycle.gtknphoqwx) iobyxmoadgVar.f42071zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
                rgvfuqvkyqVar2 = (androidx.lifecycle.rgvfuqvkyq) hkdspvbjdzVar.f60015zdlpuopuiu;
                if (rgvfuqvkyqVar2 != null) {
                    gtknphoqwxVar2.wkgbmnqykc(rgvfuqvkyqVar2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th3) {
                th2 = th3;
                rgvfuqvkyqVar = (androidx.lifecycle.rgvfuqvkyq) hkdspvbjdzVar.f60015zdlpuopuiu;
                if (rgvfuqvkyqVar != null) {
                    gtknphoqwxVar2.wkgbmnqykc(rgvfuqvkyqVar);
                }
                throw th2;
            }
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        if (gtknphoqwxVar.zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED)) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        hkdspvbjdz hkdspvbjdzVar2 = new hkdspvbjdz();
        try {
            iobyxmoadgVar.f42071zdlpuopuiu = gtknphoqwxVar;
            iobyxmoadgVar.f42070yggfygwlhe = hkdspvbjdzVar2;
            iobyxmoadgVar.f42068iwizpuwonk = 1;
            pj.rgvfuqvkyq rgvfuqvkyqVar3 = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar), 1);
            rgvfuqvkyqVar3.lereixgezr();
            zoijcleaow zoijcleaowVar = new zoijcleaow(rgvfuqvkyqVar3);
            hkdspvbjdzVar2.f60015zdlpuopuiu = zoijcleaowVar;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
            gtknphoqwxVar.iobyxmoadg(zoijcleaowVar);
            Object objZdlpuopuiu = rgvfuqvkyqVar3.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(iobyxmoadgVar);
            }
            if (objZdlpuopuiu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gtknphoqwxVar2 = gtknphoqwxVar;
            hkdspvbjdzVar = hkdspvbjdzVar2;
            rgvfuqvkyqVar2 = (androidx.lifecycle.rgvfuqvkyq) hkdspvbjdzVar.f60015zdlpuopuiu;
            if (rgvfuqvkyqVar2 != null) {
                gtknphoqwxVar2.wkgbmnqykc(rgvfuqvkyqVar2);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th4) {
            gtknphoqwxVar2 = gtknphoqwxVar;
            hkdspvbjdzVar = hkdspvbjdzVar2;
            th2 = th4;
            rgvfuqvkyqVar = (androidx.lifecycle.rgvfuqvkyq) hkdspvbjdzVar.f60015zdlpuopuiu;
            if (rgvfuqvkyqVar != null) {
                gtknphoqwxVar2.wkgbmnqykc(rgvfuqvkyqVar);
            }
            throw th2;
        }
    }

    public static final void zoijcleaow(androidx.lifecycle.gtknphoqwx gtknphoqwxVar, androidx.lifecycle.rgvfuqvkyq rgvfuqvkyqVar) {
        gtknphoqwxVar.wkgbmnqykc(rgvfuqvkyqVar);
        gtknphoqwxVar.iobyxmoadg(rgvfuqvkyqVar);
    }
}
