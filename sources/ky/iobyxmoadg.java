package ky;

import b00.FetchSmsDto;
import b00.ResendAuthSmsDto;
import iz.AuthSmsDto;
import iz.AuthTokenDto;
import iz.CheckRegistrationDto;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;
import t10.eablkybsjg;
import t10.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final eablkybsjg eablkybsjg(AuthTokenDto authTokenDto) {
        zdlpuopuiu.btonecajqb(authTokenDto, "<this>");
        String accessToken = authTokenDto.getAccessToken();
        LocalDateTime localDateTimePlusSeconds = LocalDateTime.now().plusSeconds(authTokenDto.getExpiresIn());
        zdlpuopuiu.dxjokdxxww(localDateTimePlusSeconds, "plusSeconds(...)");
        return new eablkybsjg(accessToken, localDateTimePlusSeconds);
    }

    public static final t10.iobyxmoadg iobyxmoadg(ResendAuthSmsDto resendAuthSmsDto) {
        zdlpuopuiu.btonecajqb(resendAuthSmsDto, "<this>");
        return new t10.iobyxmoadg(null, resendAuthSmsDto.getDateEnd(), resendAuthSmsDto.getDateNow(), 1, null);
    }

    public static final t10.zoijcleaow ppxfxbqfkf(CheckRegistrationDto checkRegistrationDto) {
        zdlpuopuiu.btonecajqb(checkRegistrationDto, "<this>");
        return new t10.zoijcleaow(checkRegistrationDto.getIsOnSite(), checkRegistrationDto.getHaveCard());
    }

    public static final wkgbmnqykc wkgbmnqykc(FetchSmsDto fetchSmsDto) {
        zdlpuopuiu.btonecajqb(fetchSmsDto, "<this>");
        return new wkgbmnqykc(fetchSmsDto.getToken());
    }

    public static final t10.iobyxmoadg zoijcleaow(AuthSmsDto authSmsDto) {
        zdlpuopuiu.btonecajqb(authSmsDto, "<this>");
        return new t10.iobyxmoadg(authSmsDto.getToken(), authSmsDto.getDateEnd(), authSmsDto.getDateNow());
    }
}
