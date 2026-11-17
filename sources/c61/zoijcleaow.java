package c61;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.filters.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.query : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.selectionId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.sectionId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.brandId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.filterSections : null, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.colorsModel : null, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.filterValues : null, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.amountProducts : 0, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.query : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.selectionId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.sectionId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.brandId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.filterSections : null, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.colorsModel : null, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.filterValues : zoijcleaowVar.zoijcleaow(), (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.amountProducts : zoijcleaowVar.iobyxmoadg(), (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? state.query : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? state.selectionId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? state.sectionId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? state.brandId : null, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? state.filterSections : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? state.colorsModel : null, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? state.filterValues : null, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.amountProducts : 0, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isLoading : false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
