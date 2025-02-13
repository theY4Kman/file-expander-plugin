package com.github.camork.filesystem;

import com.github.camork.filesystem.gz.GZFileType
import com.github.camork.filesystem.sevenzip.SevenZipFileType
import com.github.camork.filesystem.tar.TarFileType
import com.github.camork.filesystem.tar.TarGzFileType
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory
import org.jetbrains.annotations.NotNull

/**
 * @author Charles Wu
 */
class ArchiveFileTypeFactory extends FileTypeFactory {

    @Override
    void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(GZFileType.INSTANCE, GZFileType.INSTANCE.getDefaultExtension())
        fileTypeConsumer.consume(TarFileType.INSTANCE, TarFileType.INSTANCE.getDefaultExtension())
        fileTypeConsumer.consume(TarGzFileType.INSTANCE, TarGzFileType.INSTANCE.getDefaultExtension())
        fileTypeConsumer.consume(SevenZipFileType.INSTANCE, SevenZipFileType.INSTANCE.getDefaultExtension())
    }

}