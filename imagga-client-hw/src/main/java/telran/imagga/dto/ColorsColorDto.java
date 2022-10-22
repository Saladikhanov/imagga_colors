package telran.imagga.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class ColorsColorDto {
    List<ColorDto> background_colors;
    List<ColorDto> foreground_colors;
    List<ColorDto> image_colors;
}
