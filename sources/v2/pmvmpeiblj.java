package v2;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class pmvmpeiblj implements esjtqupxsv.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final AtomicBoolean f115653jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pj.agtfadlqog f115654yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.rgvfuqvkyq f115655zdlpuopuiu;

    public pmvmpeiblj(tg.rgvfuqvkyq onEvents, pj.agtfadlqog continuation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onEvents, "onEvents");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(continuation, "continuation");
        this.f115655zdlpuopuiu = onEvents;
        this.f115654yggfygwlhe = continuation;
        this.f115653jyumaefscl = new AtomicBoolean(false);
    }

    public final AtomicBoolean istkbnxepw() {
        return this.f115653jyumaefscl;
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void oipsdeybqn(esjtqupxsv player, esjtqupxsv.ppxfxbqfkf events) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(events, "events");
        try {
            if (this.f115653jyumaefscl.get()) {
                return;
            }
            this.f115655zdlpuopuiu.invoke(player, events);
        } catch (Throwable th2) {
            this.f115653jyumaefscl.set(true);
            pj.agtfadlqog agtfadlqogVar = this.f115654yggfygwlhe;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2)));
        }
    }
}
