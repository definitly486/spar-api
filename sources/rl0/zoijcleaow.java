package rl0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.address.impl.detail.domain.State;
import ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailInputState;
import ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailTypesState;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final AddressDetailInputState zoijcleaow(AddressDetailInputState addressDetailInputState, String str) {
        return AddressDetailInputState.eablkybsjg(addressDetailInputState, tzroggbefp.nufgyqmvbu(addressDetailInputState.getInput(), str, 0L, null, 6, null), null, 2, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.btonecajqb) {
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : ((gxszxtbevo.btonecajqb) msg).iobyxmoadg(), (6143 & 4096) != 0 ? state.typesState : null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : zoijcleaow(state.getInputCustomName(), zoijcleaowVar.iobyxmoadg()), (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : AddressDetailTypesState.eablkybsjg(state.getTypesState(), null, zoijcleaowVar.zoijcleaow(), 1, null));
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            boolean zIobyxmoadg = ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg();
            AddressDetailInputState.Companion companion = AddressDetailInputState.INSTANCE;
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : zIobyxmoadg, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : companion.iobyxmoadg(), (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : companion.iobyxmoadg(), (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : companion.iobyxmoadg(), (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            gxszxtbevo.eablkybsjg eablkybsjgVar = (gxszxtbevo.eablkybsjg) msg;
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : AddressDetailInputState.eablkybsjg(state.getInputCustomName(), eablkybsjgVar.iobyxmoadg(), null, 2, null), (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : AddressDetailTypesState.eablkybsjg(state.getTypesState(), null, eablkybsjgVar.zoijcleaow(), 1, null));
        }
        if (msg instanceof gxszxtbevo.C1862gxszxtbevo) {
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : AddressDetailInputState.eablkybsjg(state.getInputEntrance(), ((gxszxtbevo.C1862gxszxtbevo) msg).iobyxmoadg(), null, 2, null), (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : AddressDetailInputState.eablkybsjg(state.getInputFlat(), ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), null, 2, null), (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : null);
        }
        if (msg instanceof gxszxtbevo.nufgyqmvbu) {
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : AddressDetailInputState.eablkybsjg(state.getInputFloor(), ((gxszxtbevo.nufgyqmvbu) msg).iobyxmoadg(), null, 2, null), (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : null);
        }
        if (msg instanceof gxszxtbevo.dxjokdxxww) {
            return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : null, (6143 & 4) != 0 ? state.fullAddressText : null, (6143 & 8) != 0 ? state.addressLocation : null, (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : AddressDetailInputState.eablkybsjg(state.getInputIntercom(), ((gxszxtbevo.dxjokdxxww) msg).iobyxmoadg(), null, 2, null), (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : null);
        }
        if (!(msg instanceof gxszxtbevo.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
        return state.zoijcleaow((6143 & 1) != 0 ? state.mode : null, (6143 & 2) != 0 ? state.shortAddressText : iobyxmoadgVar.ppxfxbqfkf(), (6143 & 4) != 0 ? state.fullAddressText : iobyxmoadgVar.iobyxmoadg(), (6143 & 8) != 0 ? state.addressLocation : iobyxmoadgVar.zoijcleaow(), (6143 & 16) != 0 ? state.isPrivateHouseChecked : false, (6143 & 32) != 0 ? state.hasGateChecked : false, (6143 & 64) != 0 ? state.inputCustomName : null, (6143 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.inputFlat : null, (6143 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.inputEntrance : null, (6143 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.inputFloor : null, (6143 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.inputIntercom : null, (6143 & 2048) != 0 ? state.isLoading : false, (6143 & 4096) != 0 ? state.typesState : null);
    }
}
