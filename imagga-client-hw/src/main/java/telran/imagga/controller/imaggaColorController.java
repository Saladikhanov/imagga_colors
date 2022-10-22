package telran.imagga.controller;

import java.net.URISyntaxException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import telran.imagga.dto.ResponseColorDto;

public class imaggaColorController {
    static RestTemplate restTemplate = new RestTemplate();
    static final String TOKEN = "Basic YWNjXzNjZDkzMTA4ZTdmMjEyZjozYzY0ZDgzNmFiN2RjNTVhZTFkZGY1YzRiZGZiMmY4MA==";
    static String img = "https://cdn.80.lv/api/upload/content/61/images/624a5d0f5cc37/widen_1840x0.jpg";
    static String baseUrl = "https://api.imagga.com/v2/colors";

    public static void main(String[] args) throws URISyntaxException {
	HttpHeaders headers = new HttpHeaders();
	headers.add(HttpHeaders.AUTHORIZATION, TOKEN);
	UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl).queryParam("image_url", img);

	RequestEntity<String> request = new RequestEntity<>(headers, HttpMethod.GET, builder.build().toUri());
	ResponseEntity<ResponseColorDto> response = restTemplate.exchange(request, ResponseColorDto.class);
	response.getBody().getResult().getColors().getBackground_colors().forEach(System.out::println);
	response.getBody().getResult().getColors().getForeground_colors().forEach(System.out::println);
	response.getBody().getResult().getColors().getImage_colors().forEach(System.out::println);
    }

}
