FROM python:3.7-alpine
WORKDIR /code
RUN apk add --no-cache gcc musl-dev linux-headers
COPY requirements.txt requirements.txt
RUN pip3 install pandas
RUN pip3 install -r requirements.txt
COPY . .
CMD ["python3", "app.py"]