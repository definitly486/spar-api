package oy;

import kotlin.jvm.internal.zdlpuopuiu;
import sz.StatusIdDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vdvldrhtss {
    public static final o00.dxjokdxxww iobyxmoadg(StatusIdDto statusIdDto) {
        zdlpuopuiu.btonecajqb(statusIdDto, "<this>");
        String id2 = statusIdDto.getId();
        if (id2 == null) {
            id2 = "";
        }
        String name = statusIdDto.getName();
        return new o00.dxjokdxxww(id2, name != null ? name : "");
    }
}
