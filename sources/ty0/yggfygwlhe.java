package ty0;

import ay0.AddHistoryRequest;
import ay0.DeleteHistoryRequest;
import ru.myspar.proloyalty.core.domain.models.searchquery.HistoryItemModel;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ry0.HistoryListDto;

/* JADX INFO: loaded from: classes5.dex */
public final class yggfygwlhe implements k01.rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.draadjrbmk f112143iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jx0.eablkybsjg f112144zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112145jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112147zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112147zdlpuopuiu = obj;
            this.f112145jyumaefscl |= Integer.MIN_VALUE;
            return yggfygwlhe.this.wkgbmnqykc(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112148jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112150zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112150zdlpuopuiu = obj;
            this.f112148jyumaefscl |= Integer.MIN_VALUE;
            return yggfygwlhe.this.ppxfxbqfkf(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112151iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112153yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112154zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112153yggfygwlhe = obj;
            this.f112151iwizpuwonk |= Integer.MIN_VALUE;
            return yggfygwlhe.this.zoijcleaow(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112155jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112157zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112157zdlpuopuiu = obj;
            this.f112155jyumaefscl |= Integer.MIN_VALUE;
            return yggfygwlhe.this.iobyxmoadg(this);
        }
    }

    public yggfygwlhe(ww0.draadjrbmk searchHistoryApiService, jx0.eablkybsjg historyResponseMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchHistoryApiService, "searchHistoryApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(historyResponseMapper, "historyResponseMapper");
        this.f112143iobyxmoadg = searchHistoryApiService;
        this.f112144zoijcleaow = historyResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.rgvfuqvkyq
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112155jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112155jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f112157zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112155jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ww0.draadjrbmk draadjrbmkVar = this.f112143iobyxmoadg;
            zoijcleaowVar.f112155jyumaefscl = 1;
            objWkgbmnqykc = ww0.draadjrbmk.wkgbmnqykc(draadjrbmkVar, null, zoijcleaowVar, 1, null);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        Boolean result = ((BasicResponse) objWkgbmnqykc).getResult();
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(result != null ? result.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.rgvfuqvkyq
    public Object ppxfxbqfkf(HistoryItemModel historyItemModel, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f112148jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f112148jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objEablkybsjg = ppxfxbqfkfVar.f112150zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f112148jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ww0.draadjrbmk draadjrbmkVar = this.f112143iobyxmoadg;
            DeleteHistoryRequest deleteHistoryRequest = new DeleteHistoryRequest(historyItemModel.getQuery());
            ppxfxbqfkfVar.f112148jyumaefscl = 1;
            objEablkybsjg = draadjrbmkVar.eablkybsjg(deleteHistoryRequest, ppxfxbqfkfVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        Boolean result = ((BasicResponse) objEablkybsjg).getResult();
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(result != null ? result.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.rgvfuqvkyq
    public Object wkgbmnqykc(HistoryItemModel historyItemModel, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112145jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112145jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objGxszxtbevo = iobyxmoadgVar.f112147zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112145jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ww0.draadjrbmk draadjrbmkVar = this.f112143iobyxmoadg;
            AddHistoryRequest addHistoryRequest = new AddHistoryRequest(historyItemModel.getQuery());
            iobyxmoadgVar.f112145jyumaefscl = 1;
            objGxszxtbevo = draadjrbmkVar.gxszxtbevo(addHistoryRequest, iobyxmoadgVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        Boolean result = ((BasicResponse) objGxszxtbevo).getResult();
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(result != null ? result.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.rgvfuqvkyq
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        yggfygwlhe yggfygwlheVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f112151iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f112151iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = wkgbmnqykcVar.f112153yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f112151iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ww0.draadjrbmk draadjrbmkVar = this.f112143iobyxmoadg;
            wkgbmnqykcVar.f112154zdlpuopuiu = this;
            wkgbmnqykcVar.f112151iwizpuwonk = 1;
            objPpxfxbqfkf = ww0.draadjrbmk.ppxfxbqfkf(draadjrbmkVar, null, wkgbmnqykcVar, 1, null);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            yggfygwlheVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yggfygwlheVar = (yggfygwlhe) wkgbmnqykcVar.f112154zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return yggfygwlheVar.f112144zoijcleaow.iobyxmoadg((HistoryListDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }
}
