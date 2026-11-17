package pv;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mv.AddressByLocationDto;
import mv.CitiesOfPresenceDto;
import mv.ShopsByLocationDto;
import o40.eablkybsjg;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements jv.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lv.iobyxmoadg f77358iobyxmoadg;

    /* JADX INFO: renamed from: pv.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1716iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77359jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77361zdlpuopuiu;

        C1716iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77361zdlpuopuiu = obj;
            this.f77359jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77362jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77364zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77364zdlpuopuiu = obj;
            this.f77362jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77365jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77367zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77367zdlpuopuiu = obj;
            this.f77365jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public iobyxmoadg(lv.iobyxmoadg geoApiService) {
        zdlpuopuiu.btonecajqb(geoApiService, "geoApiService");
        this.f77358iobyxmoadg = geoApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jv.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f77365jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f77365jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f77367zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f77365jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            lv.iobyxmoadg iobyxmoadgVar = this.f77358iobyxmoadg;
            zoijcleaowVar.f77365jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        List items = ((CitiesOfPresenceDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null)).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ov.iobyxmoadg.ppxfxbqfkf((CitiesOfPresenceDto.CityDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jv.iobyxmoadg
    public Object ppxfxbqfkf(LocationData locationData, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f77362jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f77362jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        Object objPpxfxbqfkf = ppxfxbqfkfVar2.f77364zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f77362jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            lv.iobyxmoadg iobyxmoadgVar = this.f77358iobyxmoadg;
            double latitude = locationData.getLatitude();
            double longitude = locationData.getLongitude();
            ppxfxbqfkfVar2.f77362jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(latitude, longitude, ppxfxbqfkfVar2);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return ov.iobyxmoadg.zoijcleaow((ShopsByLocationDto) eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jv.iobyxmoadg
    public Object zoijcleaow(LocationData locationData, gxszxtbevo gxszxtbevoVar) {
        C1716iobyxmoadg c1716iobyxmoadg;
        if (gxszxtbevoVar instanceof C1716iobyxmoadg) {
            c1716iobyxmoadg = (C1716iobyxmoadg) gxszxtbevoVar;
            int i13 = c1716iobyxmoadg.f77359jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1716iobyxmoadg.f77359jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1716iobyxmoadg = new C1716iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1716iobyxmoadg = new C1716iobyxmoadg(gxszxtbevoVar);
        }
        C1716iobyxmoadg c1716iobyxmoadg2 = c1716iobyxmoadg;
        Object objIobyxmoadg = c1716iobyxmoadg2.f77361zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1716iobyxmoadg2.f77359jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            lv.iobyxmoadg iobyxmoadgVar = this.f77358iobyxmoadg;
            double latitude = locationData.getLatitude();
            double longitude = locationData.getLongitude();
            c1716iobyxmoadg2.f77359jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(latitude, longitude, c1716iobyxmoadg2);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return ov.iobyxmoadg.iobyxmoadg((AddressByLocationDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
