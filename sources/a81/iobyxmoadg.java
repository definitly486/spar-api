package a81;

import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import t71.zoijcleaow;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final b81.iobyxmoadg f1118jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final z71.iobyxmoadg f1119yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final dr0.iobyxmoadg f1120zdlpuopuiu;

    /* JADX INFO: renamed from: a81.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0018iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: a81.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0019iobyxmoadg extends wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f1122iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f1124yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f1125zdlpuopuiu;

            C0019iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f1124yggfygwlhe = obj;
                this.f1122iwizpuwonk |= Integer.MIN_VALUE;
                return C0018iobyxmoadg.this.iobyxmoadg(null, this);
            }
        }

        C0018iobyxmoadg(pkzmftpjix pkzmftpjixVar) {
            super(pkzmftpjixVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // zr0.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public Object iobyxmoadg(zoijcleaow.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            C0019iobyxmoadg c0019iobyxmoadg;
            b81.iobyxmoadg iobyxmoadgVar2;
            if (gxszxtbevoVar instanceof C0019iobyxmoadg) {
                c0019iobyxmoadg = (C0019iobyxmoadg) gxszxtbevoVar;
                int i13 = c0019iobyxmoadg.f1122iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c0019iobyxmoadg.f1122iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    c0019iobyxmoadg = new C0019iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c0019iobyxmoadg = new C0019iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = c0019iobyxmoadg.f1124yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c0019iobyxmoadg.f1122iwizpuwonk;
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                b81.iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this.f1118jyumaefscl;
                z71.iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this.f1119yggfygwlhe;
                String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
                DeliveryCode deliveryCodeIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                c0019iobyxmoadg.f1125zdlpuopuiu = iobyxmoadgVar3;
                c0019iobyxmoadg.f1122iwizpuwonk = 1;
                Object objZoijcleaow = iobyxmoadgVar4.zoijcleaow(strZoijcleaow, deliveryCodeIobyxmoadg, c0019iobyxmoadg);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj = objZoijcleaow;
                iobyxmoadgVar2 = iobyxmoadgVar3;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (b81.iobyxmoadg) c0019iobyxmoadg.f1125zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            return iobyxmoadgVar2.iobyxmoadg((y71.iobyxmoadg) obj);
        }
    }

    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, z71.iobyxmoadg evropolisRemoveSource, b81.iobyxmoadg evropolisUiMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisRemoveSource, "evropolisRemoveSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisUiMapper, "evropolisUiMapper");
        this.f1120zdlpuopuiu = dispatchersProvider;
        this.f1119yggfygwlhe = evropolisRemoveSource;
        this.f1118jyumaefscl = evropolisUiMapper;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object invoke(zoijcleaow.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return new C0018iobyxmoadg(this.f1120zdlpuopuiu.zoijcleaow()).zoijcleaow(iobyxmoadgVar, gxszxtbevoVar);
    }
}
