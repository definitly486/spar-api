package nb2;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final vipkmwdibw f69562iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final yadqdtsiqt f69563zoijcleaow;

    public gtknphoqwx(vipkmwdibw metricsEventSerializer, yadqdtsiqt uuidFactory) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricsEventSerializer, "metricsEventSerializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuidFactory, "uuidFactory");
        this.f69562iobyxmoadg = metricsEventSerializer;
        this.f69563zoijcleaow = uuidFactory;
    }

    public final btonecajqb iobyxmoadg(mb2.ppxfxbqfkf metricsEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricsEvent, "metricsEvent");
        this.f69563zoijcleaow.getClass();
        String value = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(value, "randomUUID().toString()");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f69562iobyxmoadg.getClass();
        byte[] bytes = vipkmwdibw.iobyxmoadg(metricsEvent).getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
        return new btonecajqb(value, bytes);
    }
}
