package su;

import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg extends w30.ppxfxbqfkf {
    String getId();

    @Override // w30.ppxfxbqfkf
    default String getItemId() {
        return getId();
    }

    /* JADX INFO: renamed from: gxszxtbevo */
    String getCountry();

    default String ppxfxbqfkf() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getCountry());
        String countryFlagEmoji = getCountryFlagEmoji();
        if (countryFlagEmoji != null && (!kcexrzcfyt.zfvoamnweg(countryFlagEmoji))) {
            sb3.append("  ");
            sb3.append(getCountryFlagEmoji());
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: zoijcleaow */
    String getCountryFlagEmoji();
}
