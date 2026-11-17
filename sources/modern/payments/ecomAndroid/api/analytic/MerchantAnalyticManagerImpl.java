package modern.payments.ecomAndroid.api.analytic;

import com.google.protobuf.DescriptorProtos;
import gg.cqumvgiudr;
import gg.gtknphoqwx;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.impl.C4007z9;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.jyumaefscl;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.api.analytic.model.AnalyticalEvent;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import pj.skhdrjzrfn;
import rj.lqeggnwhkg;
import tg.iobyxmoadg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u001a\u001a\u00020\u00142 \u0010\u0019\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0018\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR-\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00180\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManagerImpl;", "Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;)V", "Lpj/cllcsxoeiz;", "Lmodern/payments/ecomAndroid/api/analytic/model/AnalyticalEvent;", "analyticalEvent", "", "duplicationCounter", "Lpj/auzgnhcxok;", "sendWithDelay", "(Lpj/cllcsxoeiz;Lmodern/payments/ecomAndroid/api/analytic/model/AnalyticalEvent;I)Lpj/auzgnhcxok;", "Lmodern/payments/ecomAndroid/api/analytic/Action;", "action", "httpCode", "", "errorCode", "description", "Lgg/wwaezpbzkn;", "sendMetric", "(Lmodern/payments/ecomAndroid/api/analytic/Action;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lgg/vdvldrhtss;", "callback", "collectMetrics", "(Ltg/draadjrbmk;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "Lrj/lqeggnwhkg;", "analyticalEventChannel$delegate", "Lgg/gtknphoqwx;", "getAnalyticalEventChannel", "()Lrj/lqeggnwhkg;", "analyticalEventChannel", "", "isMetricsNotNeeded$delegate", "isMetricsNotNeeded", "()Z", "I", "temporaryAnalyticalEvent", "Lmodern/payments/ecomAndroid/api/analytic/model/AnalyticalEvent;", "sendCoroutine", "Lpj/auzgnhcxok;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MerchantAnalyticManagerImpl implements MerchantAnalyticManager {
    private static final int DUPLICATION_COUNTER_INITIAL = 0;

    /* JADX INFO: renamed from: analyticalEventChannel$delegate, reason: from kotlin metadata */
    private final gtknphoqwx analyticalEventChannel;
    private final ConfigRepository configRepository;
    private int duplicationCounter;

    /* JADX INFO: renamed from: isMetricsNotNeeded$delegate, reason: from kotlin metadata */
    private final gtknphoqwx isMetricsNotNeeded;
    private auzgnhcxok sendCoroutine;
    private AnalyticalEvent temporaryAnalyticalEvent;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$collectMetrics$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl", f = "MerchantAnalyticManagerImpl.kt", l = {68}, m = "collectMetrics")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MerchantAnalyticManagerImpl.this.collectMetrics(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$isMetricsNotNeeded$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends jyumaefscl implements iobyxmoadg {
        AnonymousClass2() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf(MerchantAnalyticManagerImpl.this.configRepository.getEcomSdkSetupConfig().getMetricCallback() == null);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$sendMetric$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$sendMetric$2", f = "MerchantAnalyticManagerImpl.kt", l = {}, m = "invokeSuspend")
    static final class C40472 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ AnalyticalEvent $analyticalEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40472(AnalyticalEvent analyticalEvent, lg.gxszxtbevo<? super C40472> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$analyticalEvent = analyticalEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            C40472 c40472 = MerchantAnalyticManagerImpl.this.new C40472(this.$analyticalEvent, gxszxtbevoVar);
            c40472.L$0 = obj;
            return c40472;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zoijcleaow.gxszxtbevo();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.L$0;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(MerchantAnalyticManagerImpl.this.temporaryAnalyticalEvent, this.$analyticalEvent)) {
                auzgnhcxok auzgnhcxokVar = MerchantAnalyticManagerImpl.this.sendCoroutine;
                if (auzgnhcxokVar != null) {
                    skhdrjzrfn.gxszxtbevo(auzgnhcxokVar, "Metric is duplicated", null, 2, null);
                }
            } else {
                MerchantAnalyticManagerImpl.this.duplicationCounter = 0;
            }
            MerchantAnalyticManagerImpl merchantAnalyticManagerImpl = MerchantAnalyticManagerImpl.this;
            AnalyticalEvent analyticalEvent = this.$analyticalEvent;
            merchantAnalyticManagerImpl.duplicationCounter++;
            merchantAnalyticManagerImpl.sendCoroutine = merchantAnalyticManagerImpl.sendWithDelay(cllcsxoeizVar, analyticalEvent, merchantAnalyticManagerImpl.duplicationCounter);
            MerchantAnalyticManagerImpl.this.temporaryAnalyticalEvent = this.$analyticalEvent;
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40472) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$sendWithDelay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$sendWithDelay$1", f = "MerchantAnalyticManagerImpl.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, C4007z9.K}, m = "invokeSuspend")
    static final class C40481 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ AnalyticalEvent $analyticalEvent;
        final /* synthetic */ int $duplicationCounter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40481(AnalyticalEvent analyticalEvent, int i13, lg.gxszxtbevo<? super C40481> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$analyticalEvent = analyticalEvent;
            this.$duplicationCounter = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return MerchantAnalyticManagerImpl.this.new C40481(this.$analyticalEvent, this.$duplicationCounter, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            this.label = 1;
            if (crxdokpmqz.zoijcleaow(300L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkg analyticalEventChannel = MerchantAnalyticManagerImpl.this.getAnalyticalEventChannel();
            vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(this.$analyticalEvent, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(this.$duplicationCounter));
            this.label = 2;
            if (analyticalEventChannel.gxszxtbevo(vdvldrhtssVarIobyxmoadg, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40481) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public MerchantAnalyticManagerImpl(ConfigRepository configRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        this.configRepository = configRepository;
        this.analyticalEventChannel = gg.draadjrbmk.zoijcleaow(MerchantAnalyticManagerImpl$analyticalEventChannel$2.INSTANCE);
        this.isMetricsNotNeeded = gg.draadjrbmk.zoijcleaow(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lqeggnwhkg getAnalyticalEventChannel() {
        return (lqeggnwhkg) this.analyticalEventChannel.getValue();
    }

    private final boolean isMetricsNotNeeded() {
        return ((Boolean) this.isMetricsNotNeeded.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok sendWithDelay(cllcsxoeiz cllcsxoeizVar, AnalyticalEvent analyticalEvent, int i13) {
        return pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, ikoacuggdj.zoijcleaow(), null, new C40481(analyticalEvent, i13, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:23:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager
    public java.lang.Object collectMetrics(tg.draadjrbmk r6, lg.gxszxtbevo<? super gg.wwaezpbzkn> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$collectMetrics$1 r0 = (modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$collectMetrics$1 r0 = new modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl$collectMetrics$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            rj.dxjokdxxww r6 = (rj.dxjokdxxww) r6
            java.lang.Object r2 = r0.L$0
            tg.draadjrbmk r2 = (tg.draadjrbmk) r2
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L60
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            gg.zdlpuopuiu.zoijcleaow(r7)
            boolean r7 = r5.isMetricsNotNeeded()
            if (r7 == 0) goto L45
            gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r6
        L45:
            rj.lqeggnwhkg r7 = r5.getAnalyticalEventChannel()
            rj.dxjokdxxww r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L50:
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r2 = r6.iobyxmoadg(r0)
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r4 = r2
            r2 = r7
            r7 = r4
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r6.next()
            gg.vdvldrhtss r7 = (gg.vdvldrhtss) r7
            if (r2 == 0) goto L73
            r2.invoke(r7)
        L73:
            r7 = r2
            goto L50
        L75:
            gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl.collectMetrics(tg.draadjrbmk, lg.gxszxtbevo):java.lang.Object");
    }

    @Override // modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager
    public Object sendMetric(Action action, Integer num, String str, String str2, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        if (isMetricsNotNeeded()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(ikoacuggdj.zoijcleaow(), new C40472(new AnalyticalEvent(action.getValue(), num, str, str2), null), gxszxtbevoVar);
        return objLqeggnwhkg == zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }
}
