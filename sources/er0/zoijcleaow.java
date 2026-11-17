package er0;

import gg.wwaezpbzkn;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
final class zoijcleaow implements sj.lqeggnwhkg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final rgvfuqvkyq f31833jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f31834yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final sj.lqeggnwhkg f31835zdlpuopuiu;

    static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f31836iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f31837jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f31838yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f31839zdlpuopuiu;

        iobyxmoadg(hkdspvbjdz hkdspvbjdzVar, hkdspvbjdz hkdspvbjdzVar2, zoijcleaow zoijcleaowVar, nufgyqmvbu nufgyqmvbuVar) {
            this.f31839zdlpuopuiu = hkdspvbjdzVar;
            this.f31838yggfygwlhe = hkdspvbjdzVar2;
            this.f31837jyumaefscl = zoijcleaowVar;
            this.f31836iwizpuwonk = nufgyqmvbuVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            Object obj2 = this.f31839zdlpuopuiu.f60015zdlpuopuiu;
            boolean z13 = true;
            boolean z14 = obj2 != null ? !((Boolean) this.f31837jyumaefscl.f31833jyumaefscl.invoke(obj2, obj)).booleanValue() : true;
            Object obj3 = this.f31838yggfygwlhe.f60015zdlpuopuiu;
            if (obj3 != null && Duration.between((Temporal) obj3, localDateTimeNow).toMillis() <= this.f31837jyumaefscl.f31834yggfygwlhe) {
                z13 = false;
            }
            if (!z14 && !z13) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            this.f31839zdlpuopuiu.f60015zdlpuopuiu = obj;
            this.f31838yggfygwlhe.f60015zdlpuopuiu = localDateTimeNow;
            Object objEmit = this.f31836iwizpuwonk.emit(obj, gxszxtbevoVar);
            return objEmit == mg.zoijcleaow.gxszxtbevo() ? objEmit : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public zoijcleaow(sj.lqeggnwhkg upstream, long j13, rgvfuqvkyq areEquivalent) {
        zdlpuopuiu.btonecajqb(upstream, "upstream");
        zdlpuopuiu.btonecajqb(areEquivalent, "areEquivalent");
        this.f31835zdlpuopuiu = upstream;
        this.f31834yggfygwlhe = j13;
        this.f31833jyumaefscl = areEquivalent;
    }

    @Override // sj.lqeggnwhkg
    public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f31835zdlpuopuiu.collect(new iobyxmoadg(new hkdspvbjdz(), new hkdspvbjdz(), this, nufgyqmvbuVar), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }
}
