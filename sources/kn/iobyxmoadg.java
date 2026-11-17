package kn;

import hg.jyumaefscl;
import ht.nufgyqmvbu;
import in.gtknphoqwx;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ln.zoijcleaow;
import mj.kcexrzcfyt;
import pm.dxjokdxxww;
import ru.myspar.address.api.model.AddressDetailScreenMode;
import ru.myspar.address.impl.detail.domain.State;
import ru.myspar.address.impl.detail.domain.models.AddressDetailTypesState;
import s40.gxszxtbevo;
import s40.ppxfxbqfkf;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: kn.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1189iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f59858iobyxmoadg;

        static {
            int[] iArr = new int[hn.iobyxmoadg.values().length];
            try {
                iArr[hn.iobyxmoadg.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hn.iobyxmoadg.WORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hn.iobyxmoadg.CUSTOM_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f59858iobyxmoadg = iArr;
        }
    }

    private static final boolean iobyxmoadg(ln.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.eablkybsjg()) {
            return !kcexrzcfyt.zfvoamnweg(iobyxmoadgVar.zoijcleaow().draadjrbmk()) && kcexrzcfyt.zfvoamnweg(iobyxmoadgVar.iobyxmoadg());
        }
        return true;
    }

    public static final gtknphoqwx ppxfxbqfkf(State state, draadjrbmk getStringRes) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        boolean z13 = true;
        boolean z14 = !state.getIsPrivateHouseChecked();
        ln.iobyxmoadg iobyxmoadgVar = new ln.iobyxmoadg(dxjokdxxww.flat_with_star, state.getInputFlat().getInput(), z14, state.getInputFlat().getError(), 1000, false);
        boolean isLoading = state.getIsLoading();
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(state.getShortAddressText(), k30.draadjrbmk.ppxfxbqfkf(), Integer.valueOf(gxszxtbevo.ic_address_delivery), Integer.valueOf(ppxfxbqfkf.colorSpecialSurface7), k30.draadjrbmk.ppxfxbqfkf(), state.getMode() instanceof AddressDetailScreenMode.EditExisted);
        ln.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = wkgbmnqykc(state.getTypesState(), getStringRes);
        ln.iobyxmoadg iobyxmoadgVar2 = new ln.iobyxmoadg(dxjokdxxww.title_name_address, state.getInputCustomName().getInput(), true, state.getInputCustomName().getError(), 50, false);
        boolean zZoijcleaow = zoijcleaow(state.getTypesState());
        ln.iobyxmoadg iobyxmoadgVar3 = new ln.iobyxmoadg(dxjokdxxww.entrance, state.getInputEntrance().getInput(), z14, state.getInputEntrance().getError(), 1000, false);
        ln.iobyxmoadg iobyxmoadgVar4 = new ln.iobyxmoadg(dxjokdxxww.floor, state.getInputFloor().getInput(), z14, state.getInputFloor().getError(), 1000, false);
        ln.iobyxmoadg iobyxmoadgVar5 = new ln.iobyxmoadg(dxjokdxxww.intercom, state.getInputIntercom().getInput(), true, state.getInputIntercom().getError(), 1000, false);
        boolean isPrivateHouseChecked = state.getIsPrivateHouseChecked();
        boolean hasGateChecked = state.getHasGateChecked();
        boolean zIobyxmoadg = iobyxmoadg(iobyxmoadgVar);
        AddressDetailScreenMode mode = state.getMode();
        if (mode instanceof AddressDetailScreenMode.CreateNew) {
            z13 = false;
        } else if (!(mode instanceof AddressDetailScreenMode.EditExisted)) {
            throw new NoWhenBranchMatchedException();
        }
        return new gtknphoqwx(isLoading, nufgyqmvbuVar, ppxfxbqfkfVarWkgbmnqykc, iobyxmoadgVar2, zZoijcleaow, iobyxmoadgVar, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, isPrivateHouseChecked, hasGateChecked, zIobyxmoadg, z13);
    }

    private static final ln.ppxfxbqfkf wkgbmnqykc(AddressDetailTypesState addressDetailTypesState, draadjrbmk draadjrbmkVar) {
        int i13;
        List<hn.iobyxmoadg> types = addressDetailTypesState.getTypes();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(types, 10));
        for (hn.iobyxmoadg iobyxmoadgVar : types) {
            int i14 = C1189iobyxmoadg.f59858iobyxmoadg[iobyxmoadgVar.ordinal()];
            if (i14 == 1) {
                i13 = tm.gxszxtbevo.home;
            } else if (i14 == 2) {
                i13 = tm.gxszxtbevo.work;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = tm.gxszxtbevo.custom_name;
            }
            arrayList.add(new zoijcleaow(iobyxmoadgVar, (String) draadjrbmkVar.invoke(Integer.valueOf(i13))));
        }
        return new ln.ppxfxbqfkf(arrayList, addressDetailTypesState.getSelectedType());
    }

    private static final boolean zoijcleaow(AddressDetailTypesState addressDetailTypesState) {
        return addressDetailTypesState.getSelectedType() != null;
    }
}
