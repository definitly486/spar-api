package oy;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.LoadInfo;
import rz.LoadInfoDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {
    public static final LoadInfo iobyxmoadg(LoadInfoDto loadInfoDto) {
        zdlpuopuiu.btonecajqb(loadInfoDto, "<this>");
        return new LoadInfo(loadInfoDto.getTitle(), loadInfoDto.getDescription(), loadInfoDto.getImage(), loadInfoDto.getNavlink(), loadInfoDto.getReference(), loadInfoDto.getAdv(), loadInfoDto.getBackgroundColorLight(), loadInfoDto.getBackgroundColorDark());
    }
}
