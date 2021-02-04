# I'm actually surprised this worked, LOL
# but I'm not doing a top-level domain filter

def domain_name(url):
    url = url.replace("http://", "").replace("https://", "").split("/")[0]
    url = url.split(".")
    url = sorted(url, key = len, reverse = True)
    return url[0]