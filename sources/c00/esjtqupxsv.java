package c00;

import hz.AddHistoryRequest;
import hz.DeleteHistoryRequest;
import ru.myspar.core.network.model.BasicResponse;
import zz.HistoryListDto;

/* JADX INFO: loaded from: classes4.dex */
public final class esjtqupxsv implements w10.rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.agtfadlqog f17944iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17945jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17947zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17947zdlpuopuiu = obj;
            this.f17945jyumaefscl |= Integer.MIN_VALUE;
            return esjtqupxsv.this.wkgbmnqykc(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17948jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17950zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17950zdlpuopuiu = obj;
            this.f17948jyumaefscl |= Integer.MIN_VALUE;
            return esjtqupxsv.this.ppxfxbqfkf(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17951jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17953zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17953zdlpuopuiu = obj;
            this.f17951jyumaefscl |= Integer.MIN_VALUE;
            return esjtqupxsv.this.zoijcleaow(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17954jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17956zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17956zdlpuopuiu = obj;
            this.f17954jyumaefscl |= Integer.MIN_VALUE;
            return esjtqupxsv.this.iobyxmoadg(this);
        }
    }

    public esjtqupxsv(ay.agtfadlqog searchHistoryApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchHistoryApiService, "searchHistoryApiService");
        this.f17944iobyxmoadg = searchHistoryApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.rgvfuqvkyq
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f17954jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f17954jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f17956zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f17954jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ay.agtfadlqog agtfadlqogVar = this.f17944iobyxmoadg;
            zoijcleaowVar.f17954jyumaefscl = 1;
            objWkgbmnqykc = ay.agtfadlqog.wkgbmnqykc(agtfadlqogVar, null, zoijcleaowVar, 1, null);
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
    @Override // w10.rgvfuqvkyq
    public Object ppxfxbqfkf(r10.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f17948jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f17948jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objEablkybsjg = ppxfxbqfkfVar.f17950zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f17948jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ay.agtfadlqog agtfadlqogVar = this.f17944iobyxmoadg;
            DeleteHistoryRequest deleteHistoryRequest = new DeleteHistoryRequest(iobyxmoadgVar.iobyxmoadg());
            ppxfxbqfkfVar.f17948jyumaefscl = 1;
            objEablkybsjg = agtfadlqogVar.eablkybsjg(deleteHistoryRequest, ppxfxbqfkfVar);
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
    @Override // w10.rgvfuqvkyq
    public Object wkgbmnqykc(r10.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar2 = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar2.f17945jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar2.f17945jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar2.f17947zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar2.f17945jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ay.agtfadlqog agtfadlqogVar = this.f17944iobyxmoadg;
            AddHistoryRequest addHistoryRequest = new AddHistoryRequest(iobyxmoadgVar.iobyxmoadg());
            iobyxmoadgVar2.f17945jyumaefscl = 1;
            objPpxfxbqfkf = agtfadlqogVar.ppxfxbqfkf(addHistoryRequest, iobyxmoadgVar2);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        Boolean result = ((BasicResponse) objPpxfxbqfkf).getResult();
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(result != null ? result.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.rgvfuqvkyq
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f17951jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f17951jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objGxszxtbevo = wkgbmnqykcVar.f17953zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f17951jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ay.agtfadlqog agtfadlqogVar = this.f17944iobyxmoadg;
            wkgbmnqykcVar.f17951jyumaefscl = 1;
            objGxszxtbevo = ay.agtfadlqog.gxszxtbevo(agtfadlqogVar, null, wkgbmnqykcVar, 1, null);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return oy.eablkybsjg.iobyxmoadg((HistoryListDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objGxszxtbevo, null, 1, null));
    }
}
