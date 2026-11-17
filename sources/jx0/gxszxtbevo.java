package jx0;

import jy0.LoadInfoDto;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.LoadInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {
    public static final LoadInfo iobyxmoadg(LoadInfoDto loadInfoDto) {
        zdlpuopuiu.btonecajqb(loadInfoDto, "<this>");
        return new LoadInfo(loadInfoDto.getTitle(), loadInfoDto.getDescription(), loadInfoDto.getImage(), loadInfoDto.getNavlink(), loadInfoDto.getReference(), loadInfoDto.getAdv(), loadInfoDto.getBackgroundColorLight(), loadInfoDto.getBackgroundColorDark());
    }
}
