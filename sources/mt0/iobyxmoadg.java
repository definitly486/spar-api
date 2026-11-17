package mt0;

import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg extends b21.ppxfxbqfkf {
    String getId();

    @Override // b21.ppxfxbqfkf
    default String getItemId() {
        return getId();
    }

    /* JADX INFO: renamed from: gxszxtbevo */
    String getCountry();

    default String ppxfxbqfkf() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getCountry());
        String strZoijcleaow = getCountryFlagEmoji();
        if (strZoijcleaow != null && (!kcexrzcfyt.zfvoamnweg(strZoijcleaow))) {
            sb3.append("  ");
            sb3.append(getCountryFlagEmoji());
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: zoijcleaow */
    String getCountryFlagEmoji();
}
