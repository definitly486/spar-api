package gn;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.address.api.model.AddressDetailScreenArgs;
import ru.myspar.address.api.model.AddressDetailScreenMode;
import ru.myspar.address.impl.detail.domain.State;
import ru.myspar.address.impl.detail.domain.models.AddressDetailInputState;
import ru.myspar.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f37947ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f37948zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f37948zoijcleaow = storeFactory;
        this.f37947ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f37947ppxfxbqfkf;
    }

    private final AddressDetailInputState draadjrbmk(AddressDetailInputState addressDetailInputState, String str) {
        return AddressDetailInputState.eablkybsjg(addressDetailInputState, tzroggbefp.nufgyqmvbu(addressDetailInputState.getInput(), str, 0L, null, 6, null), null, 2, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        AddressDetailInputState addressDetailInputStateDraadjrbmk;
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
            addressDetailInputStateDraadjrbmk = addressDetailInputStateIobyxmoadg5;
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
            AddressDetailInputState addressDetailInputStateDraadjrbmk2 = draadjrbmk(addressDetailInputStateIobyxmoadg, userAddress.getCustomName());
            AddressDetailInputState addressDetailInputStateDraadjrbmk3 = draadjrbmk(addressDetailInputStateIobyxmoadg2, userAddress.getFlat());
            AddressDetailInputState addressDetailInputStateDraadjrbmk4 = draadjrbmk(addressDetailInputStateIobyxmoadg3, userAddress.getEntrance());
            AddressDetailInputState addressDetailInputStateDraadjrbmk5 = draadjrbmk(addressDetailInputStateIobyxmoadg4, userAddress.getFloor());
            addressDetailInputStateDraadjrbmk = draadjrbmk(addressDetailInputStateIobyxmoadg5, userAddress.getIntercom());
            addressDetailInputState = addressDetailInputStateDraadjrbmk2;
            addressDetailInputState2 = addressDetailInputStateDraadjrbmk3;
            addressDetailInputState3 = addressDetailInputStateDraadjrbmk4;
            addressDetailInputState4 = addressDetailInputStateDraadjrbmk5;
            z13 = isPrivateHouse;
            z14 = hasGate;
        }
        return new State(((AddressDetailScreenArgs) gxszxtbevo()).getMode(), ((AddressDetailScreenArgs) gxszxtbevo()).getMode().getShortAddress(), ((AddressDetailScreenArgs) gxszxtbevo()).getMode().getFullAddress(), ((AddressDetailScreenArgs) gxszxtbevo()).getMode().getLocation(), z13, z14, addressDetailInputState, addressDetailInputState2, addressDetailInputState3, addressDetailInputState4, addressDetailInputStateDraadjrbmk, false, null, 6144, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f37948zoijcleaow, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f37949iobyxmoadg), new tg.iobyxmoadg() { // from class: gn.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f37946zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
