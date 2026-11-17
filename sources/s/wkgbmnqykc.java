package s;

import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.jyumaefscl;
import tg.draadjrbmk;
import z.ageimvtcrz;
import z.btonecajqb;
import z.fyldjkxazc;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f105096zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(hkdspvbjdz hkdspvbjdzVar) {
            super(1);
            this.f105096zdlpuopuiu = hkdspvbjdzVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(ageimvtcrz ageimvtcrzVar) {
            boolean z13;
            if (ageimvtcrzVar.wflxmlrfwp().n0()) {
                this.f105096zdlpuopuiu.f60015zdlpuopuiu = ageimvtcrzVar;
                z13 = false;
            } else {
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }
    }

    public static final btonecajqb ppxfxbqfkf(s.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) {
        return new ppxfxbqfkf(iobyxmoadgVar, zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ageimvtcrz zoijcleaow(ageimvtcrz ageimvtcrzVar) {
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        fyldjkxazc.wkgbmnqykc(ageimvtcrzVar, new iobyxmoadg(hkdspvbjdzVar));
        return (ageimvtcrz) hkdspvbjdzVar.f60015zdlpuopuiu;
    }
}
