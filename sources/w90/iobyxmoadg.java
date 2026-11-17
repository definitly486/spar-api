package w90;

import ft.ppxfxbqfkf;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import p90.zoijcleaow;
import pj.pkzmftpjix;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final x90.iobyxmoadg f119044jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final v90.iobyxmoadg f119045yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ns.iobyxmoadg f119046zdlpuopuiu;

    /* JADX INFO: renamed from: w90.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2970iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: w90.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2971iobyxmoadg extends wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f119048iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f119050yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f119051zdlpuopuiu;

            C2971iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f119050yggfygwlhe = obj;
                this.f119048iwizpuwonk |= Integer.MIN_VALUE;
                return C2970iobyxmoadg.this.iobyxmoadg(null, this);
            }
        }

        C2970iobyxmoadg(pkzmftpjix pkzmftpjixVar) {
            super(pkzmftpjixVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ft.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public Object iobyxmoadg(zoijcleaow.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            C2971iobyxmoadg c2971iobyxmoadg;
            x90.iobyxmoadg iobyxmoadgVar2;
            if (gxszxtbevoVar instanceof C2971iobyxmoadg) {
                c2971iobyxmoadg = (C2971iobyxmoadg) gxszxtbevoVar;
                int i13 = c2971iobyxmoadg.f119048iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c2971iobyxmoadg.f119048iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    c2971iobyxmoadg = new C2971iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c2971iobyxmoadg = new C2971iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = c2971iobyxmoadg.f119050yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c2971iobyxmoadg.f119048iwizpuwonk;
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                x90.iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this.f119044jyumaefscl;
                v90.iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this.f119045yggfygwlhe;
                String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
                DeliveryCode deliveryCodeIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                c2971iobyxmoadg.f119051zdlpuopuiu = iobyxmoadgVar3;
                c2971iobyxmoadg.f119048iwizpuwonk = 1;
                Object objIobyxmoadg = iobyxmoadgVar4.iobyxmoadg(strZoijcleaow, deliveryCodeIobyxmoadg, c2971iobyxmoadg);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj = objIobyxmoadg;
                iobyxmoadgVar2 = iobyxmoadgVar3;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (x90.iobyxmoadg) c2971iobyxmoadg.f119051zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            return iobyxmoadgVar2.iobyxmoadg((u90.iobyxmoadg) obj);
        }
    }

    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, v90.iobyxmoadg evropolisRemoveSource, x90.iobyxmoadg evropolisUiMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisRemoveSource, "evropolisRemoveSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisUiMapper, "evropolisUiMapper");
        this.f119046zdlpuopuiu = dispatchersProvider;
        this.f119045yggfygwlhe = evropolisRemoveSource;
        this.f119044jyumaefscl = evropolisUiMapper;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object invoke(zoijcleaow.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return new C2970iobyxmoadg(this.f119046zdlpuopuiu.zoijcleaow()).zoijcleaow(iobyxmoadgVar, gxszxtbevoVar);
    }
}
