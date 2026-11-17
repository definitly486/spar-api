package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class oxmwwwfdhm implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int iobyxmoadg(ByteBuffer byteBuffer, o8.zoijcleaow zoijcleaowVar) {
        return wkgbmnqykc(g9.iobyxmoadg.lqeggnwhkg(byteBuffer), zoijcleaowVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType ppxfxbqfkf(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int wkgbmnqykc(InputStream inputStream, o8.zoijcleaow zoijcleaowVar) {
        int iGxszxtbevo = new androidx.exifinterface.media.iobyxmoadg(inputStream).gxszxtbevo("Orientation", 1);
        if (iGxszxtbevo == 0) {
            return -1;
        }
        return iGxszxtbevo;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType zoijcleaow(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
