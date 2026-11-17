package kk;

import spay.sdk.R;
import spay.sdk.domain.model.response.UserInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ex extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56471zdlpuopuiu;

    public ex(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ex exVar = new ex(gxszxtbevoVar);
        exVar.f56471zdlpuopuiu = obj;
        return exVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        ex exVar = new ex((lg.gxszxtbevo) obj2);
        exVar.f56471zdlpuopuiu = (UserInfo) obj;
        return exVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        int i13;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        UserInfo userInfo = (UserInfo) this.f56471zdlpuopuiu;
        int i14 = R.string.spay_user_name_pattern;
        Object[] args = {userInfo.getFirstName(), userInfo.getLastName()};
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        ms msVar = new ms(i14, hg.agtfadlqog.i(args));
        Integer gender = userInfo.getGender();
        if (gender != null && gender.intValue() == 1) {
            i13 = R.drawable.spay_img_ava_male_4x;
        } else {
            i13 = (gender != null && gender.intValue() == 2) ? R.drawable.spay_img_ava_female_4x : R.drawable.spay_img_ava_neutral_4x;
        }
        return new st(msVar, i13, userInfo.getMobilePhone());
    }
}
