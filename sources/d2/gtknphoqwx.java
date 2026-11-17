package d2;

import gg.wwaezpbzkn;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f26797iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rj.lqeggnwhkg f26798ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AtomicInteger f26799wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f26800zoijcleaow;

    static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f26801jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f26802yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f26803zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, gtknphoqwx gtknphoqwxVar, rgvfuqvkyq rgvfuqvkyqVar) {
            super(1);
            this.f26803zdlpuopuiu = draadjrbmkVar;
            this.f26802yggfygwlhe = gtknphoqwxVar;
            this.f26801jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            wwaezpbzkn wwaezpbzknVar;
            this.f26803zdlpuopuiu.invoke(th2);
            this.f26802yggfygwlhe.f26798ppxfxbqfkf.oxmwwwfdhm(th2);
            do {
                Object objGxszxtbevo = rj.gtknphoqwx.gxszxtbevo(this.f26802yggfygwlhe.f26798ppxfxbqfkf.gtknphoqwx());
                if (objGxszxtbevo == null) {
                    wwaezpbzknVar = null;
                } else {
                    this.f26801jyumaefscl.invoke(objGxszxtbevo, th2);
                    wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                }
            } while (wwaezpbzknVar != null);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f26805yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26806zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return gtknphoqwx.this.new zoijcleaow(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0055 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0061 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0055
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r5.f26805yggfygwlhe
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gg.zdlpuopuiu.zoijcleaow(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f26806zdlpuopuiu
                tg.rgvfuqvkyq r1 = (tg.rgvfuqvkyq) r1
                gg.zdlpuopuiu.zoijcleaow(r6)
                goto L56
            L22:
                gg.zdlpuopuiu.zoijcleaow(r6)
                d2.gtknphoqwx r6 = d2.gtknphoqwx.this
                java.util.concurrent.atomic.AtomicInteger r6 = d2.gtknphoqwx.ppxfxbqfkf(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                d2.gtknphoqwx r6 = d2.gtknphoqwx.this
                pj.cllcsxoeiz r6 = d2.gtknphoqwx.wkgbmnqykc(r6)
                pj.dsvhmnatus.lqeggnwhkg(r6)
                d2.gtknphoqwx r6 = d2.gtknphoqwx.this
                tg.rgvfuqvkyq r1 = d2.gtknphoqwx.iobyxmoadg(r6)
                d2.gtknphoqwx r6 = d2.gtknphoqwx.this
                rj.lqeggnwhkg r6 = d2.gtknphoqwx.zoijcleaow(r6)
                r5.f26806zdlpuopuiu = r1
                r5.f26805yggfygwlhe = r3
                java.lang.Object r6 = r6.ppxfxbqfkf(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r4 = 0
                r5.f26806zdlpuopuiu = r4
                r5.f26805yggfygwlhe = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                d2.gtknphoqwx r6 = d2.gtknphoqwx.this
                java.util.concurrent.atomic.AtomicInteger r6 = d2.gtknphoqwx.ppxfxbqfkf(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.gtknphoqwx.zoijcleaow.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public gtknphoqwx(cllcsxoeiz scope, tg.draadjrbmk onComplete, rgvfuqvkyq onUndeliveredElement, rgvfuqvkyq consumeMessage) {
        zdlpuopuiu.btonecajqb(scope, "scope");
        zdlpuopuiu.btonecajqb(onComplete, "onComplete");
        zdlpuopuiu.btonecajqb(onUndeliveredElement, "onUndeliveredElement");
        zdlpuopuiu.btonecajqb(consumeMessage, "consumeMessage");
        this.f26797iobyxmoadg = scope;
        this.f26800zoijcleaow = consumeMessage;
        this.f26798ppxfxbqfkf = rj.btonecajqb.zoijcleaow(Integer.MAX_VALUE, null, null, 6, null);
        this.f26799wkgbmnqykc = new AtomicInteger(0);
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) scope.getCoroutineContext().get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar == null) {
            return;
        }
        auzgnhcxokVar.pmvmpeiblj(new iobyxmoadg(onComplete, this, onUndeliveredElement));
    }

    public final void eablkybsjg(Object obj) throws Throwable {
        Object objEablkybsjg = this.f26798ppxfxbqfkf.eablkybsjg(obj);
        if (objEablkybsjg instanceof rj.gtknphoqwx.iobyxmoadg) {
            Throwable thEablkybsjg = rj.gtknphoqwx.eablkybsjg(objEablkybsjg);
            if (thEablkybsjg != null) {
                throw thEablkybsjg;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!rj.gtknphoqwx.dxjokdxxww(objEablkybsjg)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f26799wkgbmnqykc.getAndIncrement() == 0) {
            pj.gtknphoqwx.wkgbmnqykc(this.f26797iobyxmoadg, null, null, new zoijcleaow(null), 3, null);
        }
    }
}
