package spay.sdk.data.dto.response;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.response.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDto", "Lspay/sdk/data/dto/response/UserInfoDto;", "Lspay/sdk/domain/model/response/UserInfo;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UserInfoDtoKt {
    public static final UserInfoDto toDto(UserInfo userInfo) {
        zdlpuopuiu.btonecajqb(userInfo, "<this>");
        return new UserInfoDto(userInfo.getLastName(), userInfo.getFirstName(), userInfo.getGender(), userInfo.getMobilePhone());
    }
}
