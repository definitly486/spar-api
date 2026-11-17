package os;

import gg.wwaezpbzkn;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
final class zoijcleaow implements sj.lqeggnwhkg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final rgvfuqvkyq f74652jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f74653yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final sj.lqeggnwhkg f74654zdlpuopuiu;

    static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f74655iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f74656jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f74657yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f74658zdlpuopuiu;

        iobyxmoadg(hkdspvbjdz hkdspvbjdzVar, hkdspvbjdz hkdspvbjdzVar2, zoijcleaow zoijcleaowVar, nufgyqmvbu nufgyqmvbuVar) {
            this.f74658zdlpuopuiu = hkdspvbjdzVar;
            this.f74657yggfygwlhe = hkdspvbjdzVar2;
            this.f74656jyumaefscl = zoijcleaowVar;
            this.f74655iwizpuwonk = nufgyqmvbuVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            Object obj2 = this.f74658zdlpuopuiu.f60015zdlpuopuiu;
            boolean z13 = true;
            boolean z14 = obj2 != null ? !((Boolean) this.f74656jyumaefscl.f74652jyumaefscl.invoke(obj2, obj)).booleanValue() : true;
            Object obj3 = this.f74657yggfygwlhe.f60015zdlpuopuiu;
            if (obj3 != null && Duration.between((Temporal) obj3, localDateTimeNow).toMillis() <= this.f74656jyumaefscl.f74653yggfygwlhe) {
                z13 = false;
            }
            if (!z14 && !z13) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            this.f74658zdlpuopuiu.f60015zdlpuopuiu = obj;
            this.f74657yggfygwlhe.f60015zdlpuopuiu = localDateTimeNow;
            Object objEmit = this.f74655iwizpuwonk.emit(obj, gxszxtbevoVar);
            return objEmit == mg.zoijcleaow.gxszxtbevo() ? objEmit : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public zoijcleaow(sj.lqeggnwhkg upstream, long j13, rgvfuqvkyq areEquivalent) {
        zdlpuopuiu.btonecajqb(upstream, "upstream");
        zdlpuopuiu.btonecajqb(areEquivalent, "areEquivalent");
        this.f74654zdlpuopuiu = upstream;
        this.f74653yggfygwlhe = j13;
        this.f74652jyumaefscl = areEquivalent;
    }

    @Override // sj.lqeggnwhkg
    public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f74654zdlpuopuiu.collect(new iobyxmoadg(new hkdspvbjdz(), new hkdspvbjdz(), this, nufgyqmvbuVar), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }
}
