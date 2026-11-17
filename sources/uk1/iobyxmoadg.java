package uk1;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.qr.domain.model.QrStatusAction;
import sk1.ChangeQrStatusesRequest;
import tk1.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements zk1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final qk1.iobyxmoadg f113797iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rk1.iobyxmoadg f113798zoijcleaow;

    /* JADX INFO: renamed from: uk1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2821iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f113799jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f113801zdlpuopuiu;

        C2821iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113801zdlpuopuiu = obj;
            this.f113799jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f113802jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f113804zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113804zdlpuopuiu = obj;
            this.f113802jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gxszxtbevo(null, this);
        }
    }

    public iobyxmoadg(qk1.iobyxmoadg api, rk1.iobyxmoadg dao) {
        zdlpuopuiu.btonecajqb(api, "api");
        zdlpuopuiu.btonecajqb(dao, "dao");
        this.f113797iobyxmoadg = api;
        this.f113798zoijcleaow = dao;
    }

    @Override // zk1.iobyxmoadg
    public Object eablkybsjg(List list, gxszxtbevo gxszxtbevoVar) {
        rk1.iobyxmoadg iobyxmoadgVar = this.f113798zoijcleaow;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tk1.wkgbmnqykc.zoijcleaow((QrStatusAction) it.next()));
        }
        Object objGxszxtbevo = iobyxmoadgVar.gxszxtbevo(arrayList, gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zk1.iobyxmoadg
    public Object gxszxtbevo(List list, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f113802jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f113802jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f113804zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f113802jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            qk1.iobyxmoadg iobyxmoadgVar = this.f113797iobyxmoadg;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(sk1.zoijcleaow.iobyxmoadg((QrStatusAction) it.next()));
            }
            ChangeQrStatusesRequest changeQrStatusesRequest = new ChangeQrStatusesRequest(arrayList);
            zoijcleaowVar.f113802jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(changeQrStatusesRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zk1.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        Object objEablkybsjg = this.f113798zoijcleaow.eablkybsjg(gxszxtbevoVar);
        return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zk1.iobyxmoadg
    public Object ppxfxbqfkf(QrStatusAction qrStatusAction, gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = this.f113798zoijcleaow.iobyxmoadg(tk1.wkgbmnqykc.zoijcleaow(qrStatusAction), gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zk1.iobyxmoadg
    public Object wkgbmnqykc(List list, gxszxtbevo gxszxtbevoVar) {
        rk1.iobyxmoadg iobyxmoadgVar = this.f113798zoijcleaow;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tk1.wkgbmnqykc.zoijcleaow((QrStatusAction) it.next()));
        }
        Object objZoijcleaow = iobyxmoadgVar.zoijcleaow(arrayList, gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zk1.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        C2821iobyxmoadg c2821iobyxmoadg;
        if (gxszxtbevoVar instanceof C2821iobyxmoadg) {
            c2821iobyxmoadg = (C2821iobyxmoadg) gxszxtbevoVar;
            int i13 = c2821iobyxmoadg.f113799jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2821iobyxmoadg.f113799jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2821iobyxmoadg = new C2821iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2821iobyxmoadg = new C2821iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = c2821iobyxmoadg.f113801zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2821iobyxmoadg.f113799jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            rk1.iobyxmoadg iobyxmoadgVar = this.f113798zoijcleaow;
            c2821iobyxmoadg.f113799jyumaefscl = 1;
            objLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(c2821iobyxmoadg);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        Iterable iterable = (Iterable) objLqeggnwhkg;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(tk1.wkgbmnqykc.iobyxmoadg((ppxfxbqfkf) it.next()));
        }
        return arrayList;
    }
}
