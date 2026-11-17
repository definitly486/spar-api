package vl0;

import b31.gxszxtbevo;
import b31.ppxfxbqfkf;
import bs0.rgvfuqvkyq;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenMode;
import ru.myspar.proloyalty.address.impl.detail.domain.State;
import ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailTypesState;
import tg.draadjrbmk;
import tl0.gtknphoqwx;
import vk0.lqeggnwhkg;
import wl0.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: vl0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2920iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f117489iobyxmoadg;

        static {
            int[] iArr = new int[sl0.iobyxmoadg.values().length];
            try {
                iArr[sl0.iobyxmoadg.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sl0.iobyxmoadg.WORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sl0.iobyxmoadg.CUSTOM_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117489iobyxmoadg = iArr;
        }
    }

    private static final boolean iobyxmoadg(wl0.iobyxmoadg iobyxmoadgVar) {
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
        wl0.iobyxmoadg iobyxmoadgVar = new wl0.iobyxmoadg(lqeggnwhkg.proloyalty_flat_with_star, state.getInputFlat().getInput(), z14, state.getInputFlat().getError(), 1000, false);
        boolean isLoading = state.getIsLoading();
        rgvfuqvkyq.iobyxmoadg iobyxmoadgVar2 = new rgvfuqvkyq.iobyxmoadg(state.getShortAddressText(), dxjokdxxww.ppxfxbqfkf(), Integer.valueOf(gxszxtbevo.ic_address_delivery), Integer.valueOf(ppxfxbqfkf.colorSpecialSurface7), dxjokdxxww.ppxfxbqfkf(), state.getMode() instanceof AddressDetailScreenMode.EditExisted);
        wl0.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = wkgbmnqykc(state.getTypesState(), getStringRes);
        wl0.iobyxmoadg iobyxmoadgVar3 = new wl0.iobyxmoadg(lqeggnwhkg.proloyalty_title_name_address, state.getInputCustomName().getInput(), true, state.getInputCustomName().getError(), 50, false);
        boolean zZoijcleaow = zoijcleaow(state.getTypesState());
        wl0.iobyxmoadg iobyxmoadgVar4 = new wl0.iobyxmoadg(lqeggnwhkg.proloyalty_entrance, state.getInputEntrance().getInput(), z14, state.getInputEntrance().getError(), 1000, false);
        wl0.iobyxmoadg iobyxmoadgVar5 = new wl0.iobyxmoadg(lqeggnwhkg.proloyalty_floor, state.getInputFloor().getInput(), z14, state.getInputFloor().getError(), 1000, false);
        wl0.iobyxmoadg iobyxmoadgVar6 = new wl0.iobyxmoadg(lqeggnwhkg.proloyalty_intercom, state.getInputIntercom().getInput(), true, state.getInputIntercom().getError(), 1000, false);
        boolean isPrivateHouseChecked = state.getIsPrivateHouseChecked();
        boolean hasGateChecked = state.getHasGateChecked();
        boolean zIobyxmoadg = iobyxmoadg(iobyxmoadgVar);
        AddressDetailScreenMode mode = state.getMode();
        if (mode instanceof AddressDetailScreenMode.CreateNew) {
            z13 = false;
        } else if (!(mode instanceof AddressDetailScreenMode.EditExisted)) {
            throw new NoWhenBranchMatchedException();
        }
        return new gtknphoqwx(isLoading, iobyxmoadgVar2, ppxfxbqfkfVarWkgbmnqykc, iobyxmoadgVar3, zZoijcleaow, iobyxmoadgVar, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, isPrivateHouseChecked, hasGateChecked, zIobyxmoadg, z13);
    }

    private static final wl0.ppxfxbqfkf wkgbmnqykc(AddressDetailTypesState addressDetailTypesState, draadjrbmk draadjrbmkVar) {
        int i13;
        List<sl0.iobyxmoadg> types = addressDetailTypesState.getTypes();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(types, 10));
        for (sl0.iobyxmoadg iobyxmoadgVar : types) {
            int i14 = C2920iobyxmoadg.f117489iobyxmoadg[iobyxmoadgVar.ordinal()];
            if (i14 == 1) {
                i13 = el0.gxszxtbevo.proloyalty_home;
            } else if (i14 == 2) {
                i13 = el0.gxszxtbevo.proloyalty_work;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = el0.gxszxtbevo.proloyalty_custom_name;
            }
            arrayList.add(new zoijcleaow(iobyxmoadgVar, (String) draadjrbmkVar.invoke(Integer.valueOf(i13))));
        }
        return new wl0.ppxfxbqfkf(arrayList, addressDetailTypesState.getSelectedType());
    }

    private static final boolean zoijcleaow(AddressDetailTypesState addressDetailTypesState) {
        return addressDetailTypesState.getSelectedType() != null;
    }
}
