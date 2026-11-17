package ju0;

import gu0.AddressByLocationDto;
import gu0.CitiesOfPresenceDto;
import gu0.ShopsByLocationDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements du0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fu0.iobyxmoadg f52438iobyxmoadg;

    /* JADX INFO: renamed from: ju0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1119iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f52439jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f52441zdlpuopuiu;

        C1119iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52441zdlpuopuiu = obj;
            this.f52439jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f52442jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f52444zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52444zdlpuopuiu = obj;
            this.f52442jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f52445jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f52447zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52447zdlpuopuiu = obj;
            this.f52445jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public iobyxmoadg(fu0.iobyxmoadg geoApiService) {
        zdlpuopuiu.btonecajqb(geoApiService, "geoApiService");
        this.f52438iobyxmoadg = geoApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // du0.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f52445jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f52445jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f52447zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f52445jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            fu0.iobyxmoadg iobyxmoadgVar = this.f52438iobyxmoadg;
            zoijcleaowVar.f52445jyumaefscl = 1;
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
        List items = ((CitiesOfPresenceDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null)).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(iu0.iobyxmoadg.ppxfxbqfkf((CitiesOfPresenceDto.CityDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // du0.iobyxmoadg
    public Object ppxfxbqfkf(LocationData locationData, gxszxtbevo gxszxtbevoVar) {
        C1119iobyxmoadg c1119iobyxmoadg;
        if (gxszxtbevoVar instanceof C1119iobyxmoadg) {
            c1119iobyxmoadg = (C1119iobyxmoadg) gxszxtbevoVar;
            int i13 = c1119iobyxmoadg.f52439jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1119iobyxmoadg.f52439jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1119iobyxmoadg = new C1119iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1119iobyxmoadg = new C1119iobyxmoadg(gxszxtbevoVar);
        }
        C1119iobyxmoadg c1119iobyxmoadg2 = c1119iobyxmoadg;
        Object objIobyxmoadg = c1119iobyxmoadg2.f52441zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1119iobyxmoadg2.f52439jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            fu0.iobyxmoadg iobyxmoadgVar = this.f52438iobyxmoadg;
            double latitude = locationData.getLatitude();
            double longitude = locationData.getLongitude();
            c1119iobyxmoadg2.f52439jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(latitude, longitude, c1119iobyxmoadg2);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iu0.iobyxmoadg.iobyxmoadg((AddressByLocationDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // du0.iobyxmoadg
    public Object zoijcleaow(LocationData locationData, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f52442jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f52442jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        Object objPpxfxbqfkf = ppxfxbqfkfVar2.f52444zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f52442jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            fu0.iobyxmoadg iobyxmoadgVar = this.f52438iobyxmoadg;
            double latitude = locationData.getLatitude();
            double longitude = locationData.getLongitude();
            ppxfxbqfkfVar2.f52442jyumaefscl = 1;
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
        return iu0.iobyxmoadg.zoijcleaow((ShopsByLocationDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }
}
