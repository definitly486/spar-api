package rl0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenArgs;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenMode;
import ru.myspar.proloyalty.address.impl.detail.domain.State;
import ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailInputState;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f83061ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f83062wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f83061ppxfxbqfkf = storeFactory;
        this.f83062wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow ojitshcjhn(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f83062wkgbmnqykc;
    }

    private final AddressDetailInputState wflxmlrfwp(AddressDetailInputState addressDetailInputState, String str) {
        return AddressDetailInputState.eablkybsjg(addressDetailInputState, tzroggbefp.nufgyqmvbu(addressDetailInputState.getInput(), str, 0L, null, 6, null), null, 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f83061ppxfxbqfkf, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f83063iobyxmoadg), new tg.iobyxmoadg() { // from class: rl0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.ojitshcjhn(this.f83060zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        AddressDetailInputState addressDetailInputStateWflxmlrfwp;
        AddressDetailInputState addressDetailInputState;
        AddressDetailInputState addressDetailInputState2;
        AddressDetailInputState addressDetailInputState3;
        AddressDetailInputState addressDetailInputState4;
        boolean z13;
        boolean z14;
        AddressDetailInputState.Companion companion = AddressDetailInputState.INSTANCE;
        AddressDetailInputState addressDetailInputStateIobyxmoadg = companion.iobyxmoadg();
        AddressDetailInputState addressDetailInputStateIobyxmoadg2 = companion.iobyxmoadg();
        AddressDetailInputState addressDetailInputStateIobyxmoadg3 = companion.iobyxmoadg();
        AddressDetailInputState addressDetailInputStateIobyxmoadg4 = companion.iobyxmoadg();
        AddressDetailInputState addressDetailInputStateIobyxmoadg5 = companion.iobyxmoadg();
        AddressDetailScreenMode mode = ((AddressDetailScreenArgs) gxszxtbevo()).getMode();
        if (mode instanceof AddressDetailScreenMode.CreateNew) {
            addressDetailInputStateWflxmlrfwp = addressDetailInputStateIobyxmoadg5;
            addressDetailInputState = addressDetailInputStateIobyxmoadg;
            addressDetailInputState2 = addressDetailInputStateIobyxmoadg2;
            addressDetailInputState3 = addressDetailInputStateIobyxmoadg3;
            addressDetailInputState4 = addressDetailInputStateIobyxmoadg4;
            z13 = false;
            z14 = false;
        } else {
            if (!(mode instanceof AddressDetailScreenMode.EditExisted)) {
                throw new NoWhenBranchMatchedException();
            }
            UserAddress.Delivery userAddress = ((AddressDetailScreenMode.EditExisted) mode).getUserAddress();
            boolean isPrivateHouse = userAddress.getIsPrivateHouse();
            boolean hasGate = userAddress.getHasGate();
            AddressDetailInputState addressDetailInputStateWflxmlrfwp2 = wflxmlrfwp(addressDetailInputStateIobyxmoadg, userAddress.getCustomName());
            AddressDetailInputState addressDetailInputStateWflxmlrfwp3 = wflxmlrfwp(addressDetailInputStateIobyxmoadg2, userAddress.getFlat());
            AddressDetailInputState addressDetailInputStateWflxmlrfwp4 = wflxmlrfwp(addressDetailInputStateIobyxmoadg3, userAddress.getEntrance());
            AddressDetailInputState addressDetailInputStateWflxmlrfwp5 = wflxmlrfwp(addressDetailInputStateIobyxmoadg4, userAddress.getFloor());
            addressDetailInputStateWflxmlrfwp = wflxmlrfwp(addressDetailInputStateIobyxmoadg5, userAddress.getIntercom());
            addressDetailInputState = addressDetailInputStateWflxmlrfwp2;
            addressDetailInputState2 = addressDetailInputStateWflxmlrfwp3;
            addressDetailInputState3 = addressDetailInputStateWflxmlrfwp4;
            addressDetailInputState4 = addressDetailInputStateWflxmlrfwp5;
            z13 = isPrivateHouse;
            z14 = hasGate;
        }
        return new State(((AddressDetailScreenArgs) gxszxtbevo()).getMode(), ((AddressDetailScreenArgs) gxszxtbevo()).getMode().getShortAddress(), ((AddressDetailScreenArgs) gxszxtbevo()).getMode().getFullAddress(), ((AddressDetailScreenArgs) gxszxtbevo()).getMode().getLocation(), z13, z14, addressDetailInputState, addressDetailInputState2, addressDetailInputState3, addressDetailInputState4, addressDetailInputStateWflxmlrfwp, false, null, 6144, null);
    }
}
